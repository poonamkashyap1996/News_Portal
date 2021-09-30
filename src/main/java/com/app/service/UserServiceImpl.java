package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IUserDao;
import com.app.pojos.CategoryDetails;
import com.app.pojos.Feedback;
import com.app.pojos.User;
import com.app.repository.userrepositories;

@Service // => spring bean class containing B.L
@Transactional // => automatic Tx management (done by spring supplied hibernate tx mgr
				// configured in hibernate-persistece.xml file
public class UserServiceImpl implements IUserService {
	// dependency
	@Autowired // autowire=byType =>SC searches for any spring bean that has imple. IUserDao n
				// supplies it's instance
	private IUserDao userDao;
	private userrepositories userRepo;
	
	@Autowired
	public void setProductRepository(userrepositories userRepo) {
		this.userRepo=userRepo;
	}

	@Override
	public User validateUser(String email, String pass) {
		// TODO Auto-generated method stub
		return userDao.validateUser(email, pass);
	}

	@Override
	public void saveUser(User u) {
		this.userRepo.save(u);
		
	}

	@Override
	public List<User> listAll() {
		//return userRepo.findAll();
		return userDao.listAll();
	}
	
	@Override
	public List<User> listAllViewer() {
		//return userRepo.findAll();
		return userDao.listAllViewer();
	}

	@Override
	public User getDetails(int id) {
		
		return userDao.getDetails(id);
	}

	@Override
	public String updateDetails(User user) {
		
		return userDao.updateDetails(user);
	}

	@Override
	public String deleteDetails(int id) {
		User  user=userDao.getDetails(id);
		if(user!=null)
			return userDao.deleteDetails(user);
		return "User Details deletion failed : Invalid User Id";
	}

	@Override
	public void saveNews(CategoryDetails n) {
		// TODO Auto-generated method stub
		userDao.save(n);
	}

	@Override
	public List<CategoryDetails> listNews() {
		// TODO Auto-generated method stub
		return userDao.listNews();
	}

	@Override
	public User getViewerDetails(int vid) {
		// TODO Auto-generated method stub
		return userDao.getViewerDetails(vid);
	}

	@Override
	public String updateViewerDetails(User user) {
		// TODO Auto-generated method stub
		return userDao.updateViewerDetails(user);
	}

	@Override
	public String deleteViewerDetails(int vid) {
		User  user=userDao.getDetails(vid);
		if(user!=null)
			return userDao.deleteViewerDetails(user);
		return "User Details deletion failed : Invalid User Id";
	}

	@Override
	public void saveFeedback(Feedback u) {
		this.userRepo.save(u);
		
	}

	@Override
	public List<Feedback> listAllSuggestion() {
		// TODO Auto-generated method stub
		return userDao.listAllSuggestion();
	}

	@Override
	public List<Feedback> listAllComplaint() {
		// TODO Auto-generated method stub
		return userDao.listAllComplaint();
	}

}
