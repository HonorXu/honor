package com.honor.model;

import java.io.Serializable;

/**
 * 角色权限
 * 
 * @创建者：honor
 * @创建时间：2018-03-29
 */
public class RolePermission implements Serializable {

	private static final long serialVersionUID = 1L;
	// 编号
	private Integer id;
	
	// 角色编号
	private Integer roleId;
	
	// 权限编号
	private Integer permissionId;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public Integer getPermissionId() {
		return permissionId;
	}
	public void setPermissionId(Integer permissionId) {
		this.permissionId = permissionId;
	}

}

