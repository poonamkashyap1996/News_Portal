package com.app.dao;

import java.util.List;

import com.app.pojos.CategoryDetails;

public interface INewsDao {

	CategoryDetails getDetails(int id);

	String updateDetails(CategoryDetails user);

	String deleteDetails(CategoryDetails user);

	List<CategoryDetails> listPolitics();

	List<CategoryDetails> listEntertainment();

	List<CategoryDetails> listEducation();

	List<CategoryDetails> listSports();

	List<CategoryDetails> listHealth();

	List<CategoryDetails> listIndustry();

	List<CategoryDetails> listEconomy();
}
