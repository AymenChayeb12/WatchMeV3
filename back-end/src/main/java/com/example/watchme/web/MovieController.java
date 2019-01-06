package com.example.watchme.web;

import java.util.List;

import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.watchme.entites.Movie;
import com.example.watchme.services.MovieService;





@Controller
public class MovieController {
	@Autowired
	private MovieService movieService;
	
	
	@RequestMapping(value = "/index")
	public String index(Model model) {
		List<Movie> listMovies = movieService.getAllMovies();
		model.addAttribute("listMovies", listMovies);

		return "movies";
	}
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(int id) {
		movieService.removeMovie((long) id);
		return "redirect:/index";
	}
	@RequestMapping(value = "/addMovie")
	public String addNewMovie(Model model) {
		Movie m = new Movie();
		model.addAttribute("movie", m);
		return "addNewMovie";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(Movie m, Model model) {
	
		movieService.addNewMovie(m);
		model.addAttribute("m", m);
		return "save";

	}


}
