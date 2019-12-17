package fr.ensim.Poo2.Model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


	@Entity
	public class Address {
	    @Id
	    @GeneratedValue
	    private Long id;
		private Date creation;
	    private String title;
	    private String content;
	    private String Auteur;
	    public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public Date getCreation() {
			return creation;
		}
		/////////////////
		public String getAuteur() {
			return Auteur;
			}
		
		public void setAuteur(String Auteur) {
			this.Auteur = Auteur;
		    }
		////////////////
		public void setCreation(Date creation) {
			this.creation = creation;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public Address(Long id, Date creation, String title, String content) {
			super();
			this.id = id;
			this.creation = creation;
			this.title = title;
			this.content = content;
		}
		public Address() {
			super();
		}
	}


