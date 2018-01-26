package com.cts.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.entity.UserEntity;
import com.cts.mapper.UserMapper;
import com.cts.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserMapper userMapper;
	
	@Override
	public int insertOne(UserEntity user) {
		// TODO Auto-generated method stub
		return userMapper.insertOne(user);
	}

	@Override
	public UserEntity selectByPk(int id) {
		// TODO Auto-generated method stub
		return userMapper.selectByPk(id);
	}

	@Override
	public List<UserEntity> selectAll() {
		// TODO Auto-generated method stub
		return userMapper.selectAll();
	}

}
