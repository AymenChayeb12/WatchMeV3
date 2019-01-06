package com.example.watchme.entites;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Fetch;
@Entity
public class User implements Serializable{
	@Id @GeneratedValue
	private Long id;
	private String first_name;
	private String last_name;
	private String password;
	@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	private List<Comment> comments;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String first_name, String last_name, String password, List<Comment> comments) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.password = password;
		this.comments = comments;
	}
	public User(String first_name, String last_name, String password) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.password = password;
	}

	

}
