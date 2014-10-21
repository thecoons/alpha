package fr.facturation.alpha;

import static com.googlecode.objectify.ObjectifyService.ofy;

import java.io.IOException;

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
		
		this.getServletContext().getRequestDispatcher("/jsp/facturation.jsp").forward(req, resp);
	}
	
}
