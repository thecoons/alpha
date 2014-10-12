package fr.patient.alpha;

import static com.googlecode.objectify.ObjectifyService.ofy;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.blobstore.BlobKey;
import com.google.appengine.api.blobstore.BlobstoreService;
import com.google.appengine.api.blobstore.BlobstoreServiceFactory;
import com.googlecode.objectify.ObjectifyService;

public class PatientServlet extends HttpServlet {
	static {
		ObjectifyService.register(PatientEntity.class);
	}
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws IOException,ServletException{
		BlobstoreService blobstoreservice = BlobstoreServiceFactory.getBlobstoreService();
		
		String search = req.getParameter("search");
		if (search != null){
		List<PatientEntity> patients = ofy().load().type(PatientEntity.class).filter("nom >=", search).filter("nom <", search + "\uFFFD").list();
		req.setAttribute("patients", patients);
		}
		
		this.getServletContext().getRequestDispatcher("/newPatient.jsp").forward(req, resp);
	}
	public void doPost (HttpServletRequest req, HttpServletResponse resp)
		throws IOException,ServletException{
		BlobstoreService blobstoreservice = BlobstoreServiceFactory.getBlobstoreService();
		
		Map<String,List<BlobKey>> blobs = blobstoreservice.getUploads(req);
		List<BlobKey> blobKeys = blobs.get("uploadedFile");
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = null;
		try {
			date = dateFormat.parse(req.getParameter("birthday"));
		} catch (ParseException e) {
			e.printStackTrace();
			System.out.println("Erreur Birthday");
		}
		
		PatientEntity patient = new PatientEntity(req.getParameter("nom"), req.getParameter("prenom"), blobKeys.get(0),date);
		
		ofy().save().entity(patient).now();
		
		resp.sendRedirect("/patient");
		
	}

}
