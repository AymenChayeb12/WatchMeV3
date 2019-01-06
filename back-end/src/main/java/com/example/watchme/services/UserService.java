package com.example.watchme.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.watchme.entites.Comment;
import com.example.watchme.entites.User;



@Transactional
@Service
public class UserService {
	@PersistenceContext
	private EntityManager em;
	
	
	public void addNewUser(User u) {
		em.persist(u);
	}
	public void addUser(String first_name,String last_name,String password) {
		User u = new User(first_name, last_name, password);
		em.persist(u);
		
	}
	public void addComment(Long userId,Comment comment) {
		User u = em.find(User.class, userId);
		em.persist(comment);
		u.getComments().add(comment);
		em.merge(u);
	}
	public void removeUser(Long userId) {
	User u = em.find(User.class, userId);
	em.remove(u);

	}
	public void updateUser(User u) {
		em.merge(u);
	}
	public List<User>getAllUser(){
		Query query = em.createQuery("from User");
		return query.getResultList();
	}
	
	public List<Comment>getAllComment(Long userId){
		User u = em.find(User.class, userId);
		return u.getComments();
	}
	
	public User getUserById(Long id) {
		return em.find(User.class, id);
	}

}
