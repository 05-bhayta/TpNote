package fr.ensim.Poo2.Model;

import fr.ensim.Poo2.Model.Geo;
import fr.ensim.Poo2.Model.Prop;

public class Features {
	
	
	private String type;
	 Geo GeometryObject;
	 Prop PropertiesObject;


	 // Getter Methods 

	 public String getType() {
	  return type;
	 }

	 public Geo getGeometry() {
	  return GeometryObject;
	 }

	 public Prop getProperties() {
	  return PropertiesObject;
	 }

	 

	 public void setType(String type) {
	  this.type = type;
	 }

	 public void setGeometry(Geo geometryObject) {
	  this.GeometryObject = geometryObject;
	 }

	 public void setProperties(Prop propertiesObject) {
	  this.PropertiesObject = propertiesObject;
	 }

}
