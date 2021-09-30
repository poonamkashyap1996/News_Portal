package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.INewsDao;
import com.app.pojos.CategoryDetails;
import com.app.pojos.User;
@Service // => spring bean class containing B.L
@Transactional // => automatic Tx management (done by spring supplied hibernate tx mgr
				// configured in hibernate-persistece.xml file

public class NewsServiceImpl implements INewsService {
	
	@Autowired // autowire=byType =>SC searches for any spring bean that has imple. IUserDao n
	private INewsDao newsDao;
	@Override
	public CategoryDetails getDetails(int id) {
		// TODO Auto-generated method stub
		return newsDao.getDetails(id);
	}

	@Override
	public String updateDetails(CategoryDetails user) {
		// TODO Auto-generated method stub
		return newsDao.updateDetails(user);
	}

	@Override
	public String deleteDetails(int id) {
		CategoryDetails  user=newsDao.getDetails(id);
		if(user!=null)
			return newsDao.deleteDetails(user);
		return "User Details deletion failed : Invalid User Id";
	}

	@Override
	public List<CategoryDetails> listPolitics() {
		// TODO Auto-generated method stub
		return newsDao.listPolitics();
	}
	
	@Override
	public List<CategoryDetails> listEntertainment() {
		// TODO Auto-generated method stub
		return newsDao.listEntertainment();
	}
	
	@Override
	public List<CategoryDetails> listEducation() {
		// TODO Auto-generated method stub
		return newsDao.listEducation();
	}
	
	@Override
	public List<CategoryDetails> listSports() {
		// TODO Auto-generated method stub
		return newsDao.listSports();
	}
	
	@Override
	public List<CategoryDetails> listHealth() {
		// TODO Auto-generated method stub
		return newsDao.listHealth();
	}
	
	@Override
	public List<CategoryDetails> listIndustry() {
		// TODO Auto-generated method stub
		return newsDao.listIndustry();
	}
	
	@Override
	public List<CategoryDetails> listEconomy() {
		// TODO Auto-generated method stub
		return newsDao.listEconomy();
	}

}
