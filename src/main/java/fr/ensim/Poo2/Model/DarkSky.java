package fr.ensim.Poo2.Model;

import fr.ensim.Poo2.Model.Now;

public class DarkSky {
	
	
	
	 private float latitude;
	 private float longitude;
	 private String timezone;
	 Now CurrentlyObject;
	 private float offset;


	 // Getter Methods 

	 public float getLatitude() {
	  return latitude;
	 }

	 public float getLongitude() {
	  return longitude;
	 }

	 public String getTimezone() {
	  return timezone;
	 }

	 public Now getCurrently() {
	  return CurrentlyObject;
	 }

	 public float getOffset() {
	  return offset;
	 }

	

	 public void setLatitude(float latitude) {
	  this.latitude = latitude;
	 }

	 public void setLongitude(float longitude) {
	  this.longitude = longitude;
	 }

	 public void setTimezone(String timezone) {
	  this.timezone = timezone;
	 }

	 public void setCurrently(Now currentlyObject) {
	  this.CurrentlyObject = currentlyObject;
	 }

	 public void setOffset(float offset) {
	  this.offset = offset;
	 }

}
