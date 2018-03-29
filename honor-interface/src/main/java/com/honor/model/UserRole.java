package com.honor.model;

import java.io.Serializable;

/**
 * 用户角色
 * 
 * @创建者：honor
 * @创建时间：2018-03-29
 */
public class UserRole implements Serializable {

	private static final long serialVersionUID = 1L;
	// 编号
	private Integer id;
	
	// 用户ID
	private Integer userId;
	
	// 角色ID
	private Integer roleId;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

}

