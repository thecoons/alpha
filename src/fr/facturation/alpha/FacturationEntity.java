package fr.facturation.alpha;

import java.util.Date;

import com.googlecode.objectify.annotation.*;

@Entity
@Cache
public class FacturationEntity {
	@Id Long id;
	@Index String patientId;
	@Index String montant;
	@Index String typePrestation;
	@Index Date date;
	
	private FacturationEntity(){};
	public FacturationEntity(String patientId,String montant,String typePrestation,Date date){
		this.patientId = patientId;
		this.montant = montant;
		this.typePrestation = typePrestation;
		this.date = date;
	}
	public Long getId() {
		return id;
	}
	public String getPatientId() {
		return patientId;
	}
	public String getMontant() {
		return montant;
	}
	public String getTypePrestation() {
		return typePrestation;
	}
	public Date getDate() {
		return date;
	}
	

}
