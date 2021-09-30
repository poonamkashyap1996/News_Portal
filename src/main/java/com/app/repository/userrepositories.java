package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.CategoryDetails;
import com.app.pojos.Feedback;
import com.app.pojos.User;

public interface  userrepositories extends JpaRepository<User , Integer> {

	void save(CategoryDetails n);

	void save(Feedback u);

	
}
