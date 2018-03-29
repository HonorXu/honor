package com.honor.model;

import java.io.Serializable;

/**
 * 用户
 * 
 * @创建者：honor
 * @创建时间：2018-03-13
 */
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	// id
	private Integer id;
	
	// 姓名
	private String name;
	
	// 年龄
	private Integer age;
	
	// 性别
	private String sex;
	
	// 学号
	private Integer stuNum;
	
	// 电话号码
	private Integer phone;
	
	// 头像
	private String headImg;
	
	// 等级
	private Integer level;
	
	//盐
	private String salt;
	
	//密码
	private String password;
	
	//邮箱
	private String email;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public Integer getPhone() {
		return phone;
	}
	public void setPhone(Integer phone) {
		this.phone = phone;
	}
	public String getHeadImg() {
		return headImg;
	}
	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public Integer getStuNum() {
		return stuNum;
	}
	public void setStuNum(Integer stuNum) {
		this.stuNum = stuNum;
	}
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}

