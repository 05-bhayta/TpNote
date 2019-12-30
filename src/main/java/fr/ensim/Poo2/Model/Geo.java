package fr.ensim.Poo2.Model;

import java.util.ArrayList;

public class Geo {

	
	private String type;
	 ArrayList < Double > coordinates = new ArrayList < Double > ();


	 // Getter Methods 

	 public String getType() {
	  return type;
	 }

	 // Setter Methods 

	 public void setType(String type) {
	  this.type = type;
	 }

	public ArrayList<Double> getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(ArrayList<Double> coordinates) {
		this.coordinates = coordinates;
	}
	
	
}
