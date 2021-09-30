package com.app.service;

import java.util.List;

import com.app.pojos.CategoryDetails;
import com.app.pojos.Feedback;
import com.app.pojos.User;

public interface IUserService {
	// add a method for user validation
	
	User validateUser(String email, String pass);
	void saveUser(User u);
	List<User> listAll();
	List<CategoryDetails> listNews();
	
	User getDetails(int id);
	String updateDetails(User user);
	
	String deleteDetails(int id);
	void saveNews(CategoryDetails n);
	List<User> listAllViewer();
	User getViewerDetails(int vid);
	String updateViewerDetails(User user);
	String deleteViewerDetails(int vid);
	void saveFeedback(Feedback u);
	List<Feedback> listAllSuggestion();
	List<Feedback> listAllComplaint();
	
}
