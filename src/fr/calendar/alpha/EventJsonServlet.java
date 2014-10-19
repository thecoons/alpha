package fr.calendar.alpha;

import static com.googlecode.objectify.ObjectifyService.ofy;

import java.io.IOException;
import java.util.List;

import com.google.appengine.labs.repackaged.org.json.JSONArray;
import com.google.appengine.labs.repackaged.org.json.JSONException;
import com.google.appengine.labs.repackaged.org.json.JSONObject;
import com.googlecode.objectify.ObjectifyService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EventJsonServlet extends HttpServlet {
	static  {
		ObjectifyService.register(EventEntity.class);
	}
	public void doGet(HttpServletRequest req,HttpServletResponse resp)
		throws IOException,ServletException	{
		
		List<EventEntity> events = ofy().load().type(EventEntity.class).list();
		
		JSONObject json = new JSONObject();
		JSONArray results = new JSONArray();
		JSONObject result;
		
		try{
		
		
		for(EventEntity event : events)
		{
			result = new JSONObject();
			result.put("id",event.getId());
			result.put("title",event.getTitle());
			result.put("url", event.getUrl());
			result.put("class",event.getType());
			result.put("start",event.getDateStart().getTime());
			result.put("end", event.getDateEnd().getTime());
			results.put(result);
		}
		json.put("result",results);
		json.put("success", 1);
		}
		catch (JSONException jse){
		}
		resp.setContentType("application/json");
		resp.getWriter().write(json.toString());
		}
		
	}


