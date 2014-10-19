package fr.calendar.alpha;

import static com.googlecode.objectify.ObjectifyService.ofy;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.googlecode.objectify.ObjectifyService;

public class CalendarServlet extends HttpServlet {
	static  {
		ObjectifyService.register(EventEntity.class);
	}
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws IOException,ServletException{
		
		List<EventEntity> events = ofy().load().type(EventEntity.class).list();
		List<String> eventsJson = new ArrayList<String>();
		for(EventEntity event : events){
			eventsJson.add(event.toJson());
		};
		req.setAttribute("events", eventsJson);
		
		
		
		
		this.getServletContext().getRequestDispatcher("/jsp/calendar.jsp").forward(req, resp);
		
	}
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
		throws IOException, ServletException{
		SimpleDateFormat dateStartFormat = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat dateEndFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateStartFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
		dateEndFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
		Date dateStart = null;
		Date dateEnd = null;
		
		try{
			dateStart = dateStartFormat.parse(req.getParameter("datestart"));
			dateEnd = dateEndFormat.parse(req.getParameter("dateend"));
		}catch (ParseException e){
			e.printStackTrace();
			System.out.println("Erreur dateParse ...");
		}
		
		EventEntity event = new EventEntity(req.getParameter("datetitle"), dateStart, dateEnd, req.getParameter("datetype"));
		ofy().save().entity(event).now();
		
		resp.sendRedirect("/calendar");
	}

}
