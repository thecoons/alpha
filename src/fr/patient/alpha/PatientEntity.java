package fr.patient.alpha;

import java.util.Date;

import com.google.appengine.api.blobstore.BlobKey;
import com.google.appengine.api.images.ImagesService;
import com.google.appengine.api.images.ImagesServiceFactory;
import com.google.appengine.api.images.ServingUrlOptions;
import com.googlecode.objectify.annotation.*;

@Entity
@Cache
public class PatientEntity {
	@Id Long id;
	@Index String nom;
	@Index String prenom;
	@Index BlobKey key;
	String url;
	@Index Date birthDay;
	
	private PatientEntity(){};
	public PatientEntity(String nom,String prenom,BlobKey key,Date birthday){
		ImagesService imageService = ImagesServiceFactory.getImagesService();
		
		this.birthDay = birthday;
		this.nom = nom;
		this.prenom = prenom;
		this.key = key;
		this.url = imageService.getServingUrl(ServingUrlOptions.Builder.withBlobKey(key));
	}
	public Long getId() {
		return id;
	}
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public BlobKey getKey() {
		return key;
	}
	public String getUrl() {
		return url;
	}
	public Date getBirthDay() {
		return birthDay;
	}

}
