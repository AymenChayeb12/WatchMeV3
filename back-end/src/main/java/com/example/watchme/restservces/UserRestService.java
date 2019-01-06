package com.example.watchme.restservces;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.watchme.entites.Comment;
import com.example.watchme.services.UserService;



@RestController
@CrossOrigin(value="http://localhost:4200")
public class UserRestService {
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/comment/{id}",method=RequestMethod.GET)
	public List<Comment> getAllComments(@PathVariable Long id){
		return userService.getAllComment(id);
	}
	
	@RequestMapping(value = "/addComment/{id}",method=RequestMethod.POST)
	public String addComment(@RequestBody Comment c,@PathVariable Long id){
		try {
			userService.addComment(id, c);
			return "success";
		} catch (Exception e) {
			// TODO: handle exception
			return e.toString();
		}
	}
	
	
	
}