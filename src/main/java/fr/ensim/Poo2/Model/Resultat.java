package fr.ensim.Poo2.Model;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import fr.ensim.Poo2.Model.Features;
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class Resultat {
	
	
	
	@Id
	@GeneratedValue
	private Long id;
	
	 private String type;
	 private String version;
	 ArrayList < Features > features = new ArrayList < Features > ();
	 private String attribution;
	 private String licence;
	 private String query;
	 private float limit;


	 // Getter Methods 

	 public ArrayList<Features> getFeatures() {
		return features;
	}

	public void setFeatures(ArrayList<Features> features) {
		this.features = features;
	}

	public void setLimit(float limit) {
		this.limit = limit;
	}

	public String getType() {
	  return type;
	 }

	 public String getVersion() {
	  return version;
	 }

	 public String getAttribution() {
	  return attribution;
	 }

	 public String getLicence() {
	  return licence;
	 }

	 public String getQuery() {
	  return query;
	 }

	 public float getLimit() {
	  return limit;
	 }

	 

	 public void setType(String type) {
	  this.type = type;
	 }

	 public void setVersion(String version) {
	  this.version = version;
	 }

	 
	 
	 
	 

}
