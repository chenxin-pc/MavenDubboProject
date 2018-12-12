package cn.com.demo.dubbo.respository.impl;

import com.alibaba.dubbo.config.annotation.Service;

import cn.com.demo.dubbo.entity.User;
import cn.com.demo.dubbo.respository.UserRespository;

@Service(
		version="${dubbo.service.version}",
		application="${dubbo.application.id}",
		registry="${dubbo.registry.id}",
		protocol="${dubbo.protocol.id}"
		)
public class UserRespositoryImpl implements UserRespository{

	@Override
	public User selectByid(String id) {
		System.out.println("==========");
		User user = new User();
		user.setUrAge(111);
		user.setUrId("111");
		user.setUrName("www");
		return user;
	}
    
}
