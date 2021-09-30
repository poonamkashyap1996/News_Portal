package com.app.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Category;
import com.app.pojos.CategoryDetails;
@Repository 
public class NewsDaoImpl implements INewsDao {

	@Autowired // byType
	private EntityManager manager;
	
	@Override
	public CategoryDetails getDetails(int id) {
		// TODO Auto-generated method stub
		return manager.find(CategoryDetails.class, id);
	}

	@Override
	public String updateDetails(CategoryDetails user) {
	CategoryDetails persistentUser=manager.merge(user);
		return "Title : "+persistentUser.getTitle()+" Updated";
	}

	@Override
	public String deleteDetails(CategoryDetails user) {
		manager.remove(user);
		return "User" + user.getTitle()+" 's details deleted..";
	}

	@Override
	public List<CategoryDetails> listPolitics() {
		String jpql="Select c from CategoryDetails c where c.category=:c1";
		return manager.createQuery(jpql,CategoryDetails.class).setParameter("c1",Category.POLITICS).getResultList();
	}
	
	@Override
	public List<CategoryDetails> listEntertainment() {
		String jpql="Select c from CategoryDetails c where c.category=:c1";
		return manager.createQuery(jpql,CategoryDetails.class).setParameter("c1",Category.ENTERTAINMENT).getResultList();
	}

	@Override
	public List<CategoryDetails> listEducation() {
		String jpql="Select c from CategoryDetails c where c.category=:c1";
		return manager.createQuery(jpql,CategoryDetails.class).setParameter("c1",Category.EDUCATION).getResultList();
	}

	@Override
	public List<CategoryDetails> listSports() {
		String jpql="Select c from CategoryDetails c where c.category=:c1";
		return manager.createQuery(jpql,CategoryDetails.class).setParameter("c1",Category.SPORTS).getResultList();
	}

	@Override
	public List<CategoryDetails> listHealth() {
		String jpql="Select c from CategoryDetails c where c.category=:c1";
		return manager.createQuery(jpql,CategoryDetails.class).setParameter("c1",Category.HEALTH).getResultList();
	}

	@Override
	public List<CategoryDetails> listIndustry() {
		String jpql="Select c from CategoryDetails c where c.category=:c1";
		return manager.createQuery(jpql,CategoryDetails.class).setParameter("c1",Category.INDUSTRY).getResultList();
	}

	@Override
	public List<CategoryDetails> listEconomy() {
		String jpql="Select c from CategoryDetails c where c.category=:c1";
		return manager.createQuery(jpql,CategoryDetails.class).setParameter("c1",Category.ECONOMY).getResultList();
	}


}
