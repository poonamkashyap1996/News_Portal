package com.app.service;

import java.util.List;

import com.app.pojos.CategoryDetails;


public interface INewsService {

	CategoryDetails getDetails(int id);
	String updateDetails(CategoryDetails user);
	
	String deleteDetails(int id);
	List<CategoryDetails> listPolitics();
	List<CategoryDetails> listEntertainment();
	List<CategoryDetails> listEducation();
	List<CategoryDetails> listSports();
	List<CategoryDetails> listHealth();
	List<CategoryDetails> listIndustry();
	List<CategoryDetails> listEconomy();
}
