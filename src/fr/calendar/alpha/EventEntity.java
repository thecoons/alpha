package fr.calendar.alpha;

import java.util.Date;

import com.google.gson.Gson;
import com.googlecode.objectify.annotation.Cache;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

@Entity
@Cache
public class EventEntity {
	@Id Long id;
	String titre ;
	@Index Date dateStart;
	@Index Date dateEnd;
	@Index String type;
	
	private EventEntity(){};
	public EventEntity(String titre,Date dateStart,Date dateEnd,String type){
		this.titre= titre;
		this.dateStart = dateStart;
		this.dateEnd = dateEnd;
		this.type = type;
	}
	
	public Long getId() {
		return id;
	}
	public String getTitre() {
		return titre;
	}
	public Date getDateStart() {
		return dateStart;
	}
	public Date getDateEnd() {
		return dateEnd;
	}
	public String getType() {
		return type;
	}
	public String toJson()	{
		Gson gson = new Gson();
		return gson.toJson(this);
	}

}
