package fr.calendar.alpha;

import java.util.Date;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.googlecode.objectify.annotation.Cache;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

@Entity
@Cache
public class EventEntity {
	@Id Long id;
	String title ;
	String url;
	@Index Date start;
	@Index Date end;
	@Index String type;
	
	private EventEntity(){};
	public EventEntity(String titre,Date dateStart,Date dateEnd,String type){
		this.title= titre;
		this.start = dateStart;
		this.end = dateEnd;
		this.type = type;
	}
	
	public Long getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getUrl(){
		return url;
	}
	public Date getDateStart() {
		return start;
	}
	public Date getDateEnd() {
		return end;
	}
	public String getType() {
		return type;
	}
	public String toJson()	{
		JsonObject json = new JsonObject();
		json.addProperty("id", this.id);
		json.addProperty("title", this.getTitle());
		json.addProperty("url", "");
		json.addProperty("start", Long.toString(this.start.getTime()));
		json.addProperty("end", Long.toString(this.end.getTime()));
		json.addProperty("class", this.type);
		
		
		return json.toString();
	}

}
