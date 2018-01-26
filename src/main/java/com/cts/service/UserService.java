package com.cts.service;

import java.util.List;

import com.cts.entity.UserEntity;

public interface UserService {
	int insertOne(UserEntity user);  
    UserEntity selectByPk(int id); 
    List<UserEntity> selectAll();
}
