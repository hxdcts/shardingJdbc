package com.cts.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cts.entity.UserEntity;
@Component
public interface UserMapper {
	int insertOne(UserEntity user);  
    UserEntity selectByPk(int id); 
    List<UserEntity> selectAll();
}
