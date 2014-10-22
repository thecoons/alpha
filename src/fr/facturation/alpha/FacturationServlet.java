package fr.facturation.alpha;

import static com.googlecode.objectify.ObjectifyService.ofy;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.googlecode.objectify.ObjectifyService;

public class FacturationServlet extends HttpServlet {
	static{
		ObjectifyService.register(FacturationEntity.class);
	}
	public void doGet(HttpServletRequest req,HttpServletResponse resp)
		throws IOException, ServletException{
		
		String searchType = req.getParameter("searchType");
		String search = req.getParameter("search");
		
		System.out.println(search +" "+searchType);
		
		if(searchType != null && search != null){
			
			List<FacturationEntity> facts = ofy().load().type(FacturationEntity.class).filter(searchType+" >=",search).filter(searchType+" <",search+"\uFFFD").list();
			req.setAttribute("facts", facts);
		}
		
		this.getServletContext().getRequestDispatcher("/jsp/facturation.jsp").forward(req, resp);
	}
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
		throws IOException,ServletException{
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date date = null;
		
		System.out.println(req.getParameter("date"));
		System.out.println(req.getParameter("type"));
		
		try{
			date = dateFormat.parse(req.getParameter("date"));
			
		}catch (ParseException e){
			e.printStackTrace();
			System.out.println("Erreur dateParse");
		}
		
		FacturationEntity fact = new FacturationEntity(req.getParameter("idPatient"),req.getParameter("montant"), req.getParameter("type"), date);
		ofy().save().entity(fact).now();
		
		resp.sendRedirect("/facturation");
	}
}
