package com.example.watchme.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.watchme.entites.Comment;
import com.example.watchme.entites.Movie;
import com.example.watchme.entites.User;


@Transactional 
@Service
public class MovieService {
	
	
	@PersistenceContext
	private EntityManager em;
	
	public void addNewMovie(Movie m) {
		em.persist(m);
		
	}
	public Movie getMovieByID (Long id) {
		return em.find(Movie.class, id);
	}
	
//	public void addMovie(String name , String genre ) {
//		Movie m=new Movie(name,genre);
//		
//		em.persist(m);
//		
//	}
	
	public void addMovie(Movie m ) {
				em.persist(m);
		
	}
	
	
	public void updateMovie(Movie m) {
		
		em.merge(m);
	}
	
	public List<Movie> getAllMovies(){
		Query query= em.createQuery("from Movie m");
		return query.getResultList();
		
	}
	
	public void removeMovie(Long movieId) {
	Movie m = em.find(Movie.class, movieId);
	em.remove(m);

	}
	///////////////////////////////////////
	
	public void addComment(Long movieId,Comment comment) {
		Movie m = em.find(Movie.class, movieId);
		em.persist(comment);
		m.getComments().add(comment);
		em.merge(m);
	}
	
	public List<Comment>getAllComment(Long movieId){
		Movie m = em.find(Movie.class, movieId);
		return m.getComments();
	}
	
	
	
	

}
