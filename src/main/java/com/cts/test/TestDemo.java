package com.cts.test;

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
	static Logger logger = LoggerFactory.getLogger(TestDemo.class);
	public static void main(String[] args) {  
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:/*.xml");  
        logger.debug("=======");
        UserService mapper = context.getBean(UserService.class); 
        log.info("start = ");
        for(int i=0;i<=40;i++){
            mapper.insertOne(new UserEntity(i, "hello"+i, i));  
        }
        List<UserEntity> list = mapper.selectAll();
        for(int i=1;i<list.size();i++){
            UserEntity userEntity = mapper.selectByPk(i);
            logger.info(userEntity.getId()+"");
        }
        		
    } 
	 @Test  
	    public void test(){  
	        ApplicationContext context=new ClassPathXmlApplicationContext("classpath*:spring-mybatis.xml");  
	        log.info("1111");
	        //UserService userService=(UserService)context.getBean("userService");  
	    }  
}
