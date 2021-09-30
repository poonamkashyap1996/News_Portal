package com.app.dao;


import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.CategoryDetails;
import com.app.pojos.Feedback;
import com.app.pojos.FeedbackCategory;
import com.app.pojos.Roles;
import com.app.pojos.User;

@Repository // to tell SC : following class is a spring bean that contains data access logic + enables exc
			// translation mechanism
public class UserDaoImpl implements IUserDao {
	// dependency : D.I
	
	@Autowired // byType
	private EntityManager manager;//equivalent to org.hibernate.Session , associated with L1 cache n 
	//represents pooled out DB connection : from connection pool managed by Hikari 
	
	@Override
	public User validateUser(String email, String pass) {
		String jpql="select u from User u where u.email=:em and u.password=:pass";
		
		return manager.
				createQuery(jpql, User.class).
				setParameter("em", email).
				setParameter("pass",pass).getSingleResult();
	}

//	@Override
//	public String registerUser(User u) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public List<User> listAll() {
		String jpql="select u from User u where u.role=:r1";
		return manager.createQuery(jpql,User.class).setParameter("r1", Roles.REPORTER).getResultList();
	}
	
	@Override
	public List<User> listAllViewer() {
		String jpql="select u from User u where u.role=:r1";
		return manager.createQuery(jpql,User.class).setParameter("r1", Roles.VIEWER).getResultList();
	}

	@Override
	public User getDetails(int id) {
		return manager.find(User.class, id);
	}

	@Override
	public String updateDetails(User user) {
		User persistentUser=manager.merge(user);
		return "User Details Updated for ID"+persistentUser.getId();
	}

	@Override
	public String deleteDetails(User user) {
		manager.remove(user);
		return "User " + user.getFname()+" 's details deleted..";
	}

	@Override
	public String save(CategoryDetails c) {
		manager.persist(c);
		return "News is added";
	}

	@Override
	public List<CategoryDetails> listNews() {
		String jpql="select u from CategoryDetails u";
		return manager.createQuery(jpql,CategoryDetails.class).getResultList();
	}

	@Override
	public User getViewerDetails(int vid) {
		return manager.find(User.class, vid);
	}

	@Override
	public String updateViewerDetails(User user) {
		User persistentUser=manager.merge(user);
		return "User Details Updated for ID"+persistentUser.getId();
	}

	@Override
	public String deleteViewerDetails(User user) {
		manager.remove(user);
		return "User" + user.getFname()+" 's details deleted..";
	}

	@Override
	public List<Feedback> listAllSuggestion() {
		String jpql="select u from Feedback u where u.feedbacktype=:r2";
		return manager.createQuery(jpql,Feedback.class).setParameter("r2", FeedbackCategory.SUGGESTION).getResultList();
	
	}

	@Override
	public List<Feedback> listAllComplaint() {
		String jpql="select u from Feedback u where u.feedbacktype=:r1";
		return manager.createQuery(jpql,Feedback.class).setParameter("r1", FeedbackCategory.COMPLAINT).getResultList();
	
	}
	

}
