package cn.com.demo.dubbo.entity;

import java.io.Serializable;

public class User implements Serializable{
  private String urName;
  private int urAge;
  private String urId;
public String getUrName() {
	return urName;
}
public void setUrName(String urName) {
	this.urName = urName;
}
public int getUrAge() {
	return urAge;
}
public void setUrAge(int urAge) {
	this.urAge = urAge;
}
public String getUrId() {
	return urId;
}
public void setUrId(String urId) {
	this.urId = urId;
}
  
}