package com.app.dao;

import java.util.List;

import com.app.pojos.CategoryDetails;
import com.app.pojos.Feedback;
import com.app.pojos.User;

public interface IUserDao {
//add a method for user validation
	User validateUser(String email,String pass);
	
	//public String registerUser(User u);
	
	List<User> listAll();
	
	User getDetails(int id);
	
	String updateDetails(User user);
	
	String deleteDetails(User user);
	String save(CategoryDetails c);

	List<CategoryDetails> listNews();

	List<User> listAllViewer();

	User getViewerDetails(int vid);

	String updateViewerDetails(User user);

	String deleteViewerDetails(User user);

	List<Feedback> listAllSuggestion();

	List<Feedback> listAllComplaint();
}
