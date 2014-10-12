package fr.calendar.alpha;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.googlecode.objectify.ObjectifyService;

import fr.patient.alpha.PatientEntity;

public class CalendarServlet extends HttpServlet {
	static  {
		ObjectifyService.register(PatientEntity.class);
	}
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws IOException,ServletException{
		
		this.getServletContext().getRequestDispatcher("/jsp/calendar.jsp").forward(req, resp);
		
	}

}
