package fr.facturation.alpha;

import java.util.Date;

import com.googlecode.objectify.annotation.*;

@Entity
@Cache
public class FacturationEntity {
	@Id Long id;
	@Index Long patientId;
	@Index Long montant;
	@Index String typePrestation;
	@Index Date date;
	
	private FacturationEntity(){};
	public FacturationEntity(Long patientId,Long montant,String typePrestation,Date date){
		this.patientId = patientId;
		this.montant = montant;
		this.typePrestation = typePrestation;
		this.date = date;
	}
	public Long getId() {
		return id;
	}
	public Long getPatientId() {
		return patientId;
	}
	public Long getMontant() {
		return montant;
	}
	public String getTypePrestation() {
		return typePrestation;
	}
	public Date getDate() {
		return date;
	}
	

}
