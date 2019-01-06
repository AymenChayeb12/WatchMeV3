package com.example.watchme.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity 
public class Movie implements Serializable {
	
	
	@Id @GeneratedValue
	private long id;
	private String name;
	private String rate;
	private String genre;
	private String link;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	//fasa5ni
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String image) {
		this.link = image;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", rate=" + rate + ", genre=" + genre + ", image=" + link + "]";
	}
	
	
	
	public Movie() {
		super();
	}
	public Movie(String name, String rate, String genre, String image) {
		super();
	
		this.name = name;
		this.rate = rate;
		this.genre = genre;
		this.link = image;
	}
	
	public Movie(String name , String genre) {
		super();
		this.name=name;
		this.genre=genre;
		
	}
	
	

}
