package com.example.watchme.entites;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Comment implements Serializable {
	@Id @GeneratedValue
	private Long id;
	private String body;
	@Temporal(TemporalType.DATE)
	private Date date;
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getId() {
		return id;
	}
	public Comment(String body) {
		super();
		String pattern = "dd/MM/yyyy";
		DateFormat df = new SimpleDateFormat(pattern);
	    
		String dateInString =new SimpleDateFormat(pattern).format(new Date());
		this.body = body;
		try {
			this.date = df.parse(dateInString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
