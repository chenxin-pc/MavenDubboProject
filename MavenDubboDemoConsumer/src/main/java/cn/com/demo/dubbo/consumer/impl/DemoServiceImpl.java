package cn.com.demo.dubbo.consumer.impl;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;

import cn.com.demo.dubbo.consumer.DemoService;
import cn.com.demo.dubbo.entity.User;
import cn.com.demo.dubbo.respository.UserRespository;

@Service
public class DemoServiceImpl implements DemoService{
    
	@Reference(version = "${dubbo.application.version}", 
			application = "${dubbo.application.id}", 
			registry = "${dubbo.registry.id}")
	private UserRespository respository;
	
	@Override
	public User findUserById(String urId) {
		// TODO Auto-generated method stub
		return this.respository.selectByid(urId);
	}

}
