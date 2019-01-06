package com.example.watchme.restservces;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.watchme.entites.Movie;
import com.example.watchme.services.MovieService;

@RestController 
@CrossOrigin(origins = "http://localhost:4200")
public class MovieRestService {
	
	@Autowired
	MovieService movieservice;
	
	
	
	
	@RequestMapping(value = "/movie/{id}",method=RequestMethod.GET)
	public Movie getMovieByID(@PathVariable Long id){
		return movieservice.getMovieByID(id);
	}
	
	
	
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String addMovie(@RequestBody Movie m ) {
		try {
			movieservice.addMovie(m);
			return "Seceeded";
		} catch (Exception e) {
			// TODO: handle exception
			return e.toString();
		}
			
	}
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public void updateMovie(@RequestBody Movie m) {
		movieservice.updateMovie(m);
	}
	
	@RequestMapping(value = "/movies",method=RequestMethod.GET)
	public List<Movie> getAllMovies(){
		return movieservice.getAllMovies();
	}
	
	

		
	
	
	
}
