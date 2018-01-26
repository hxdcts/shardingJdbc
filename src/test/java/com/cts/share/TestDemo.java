package com.cts.share;

import java.util.List;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.cts.entity.UserEntity;
import com.cts.service.UserService;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class TestDemo {
	public static void main(String[] args) {  
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:/*.xml");  
        UserService mapper = context.getBean(UserService.class); 
        for(int i=0;i<=20;i++){
            mapper.insertOne(new UserEntity(i, "hello"+i, i));  
        }
        List<UserEntity> list = mapper.selectAll();
        for(int i=1;i<list.size();i++){
            UserEntity userEntity = mapper.selectByPk(i);
            log.info(userEntity.getId()+"");
        }
        		
    } 
}
