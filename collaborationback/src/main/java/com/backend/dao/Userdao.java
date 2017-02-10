package com.backend.dao;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

import com.backend.model.User;
@ComponentScan("com")
@Repository
public interface Userdao {
	public  void registerUser(User user);
}
