package cn.com.demo.dubbo.consumer;

import cn.com.demo.dubbo.entity.User;

public interface DemoService {
     public User findUserById(String urId);		
}
