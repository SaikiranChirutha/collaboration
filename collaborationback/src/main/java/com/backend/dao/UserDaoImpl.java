package com.backend.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

import com.backend.model.User;
@ComponentScan("com")
@Repository("UserDaoImpl")
@Transactional


public class UserDaoImpl implements Userdao {
	@Autowired
	private SessionFactory sessionFactory;

	public void registerUser(User user) {
	
		Session session=sessionFactory.getCurrentSession();
		session.save(user);
		System.out.println("user saved");	
	}

}
