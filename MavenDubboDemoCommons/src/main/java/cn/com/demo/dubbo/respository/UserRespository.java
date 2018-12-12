package cn.com.demo.dubbo.respository;

import cn.com.demo.dubbo.entity.User;

public interface UserRespository {
  public User selectByid(String id);
}
