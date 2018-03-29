package com.honor.Impl;

import java.util.List;

import com.honor.biz.RolePermissionBiz;
import com.honor.dal.mapper.RolePermissionMapper;
import com.honor.model.RolePermission;

/**
 * 角色权限业务实现
 *
 * @创建者：honor
 * @创建时间：2018-03-29
 */
public class RolePermissionBizImpl implements RolePermissionBiz {

	private RolePermissionMapper rolePermissionMapper;

	public RolePermissionMapper getRolePermissionMapper() {
		return rolePermissionMapper;
	}

	public void setRolePermissionMapper(RolePermissionMapper rolePermissionMapper) {
		this.rolePermissionMapper = rolePermissionMapper;
	}
	
	@Override
	public int add(RolePermission rolePermission) {
		rolePermissionMapper.insert(rolePermission);
		return rolePermission.getId();
	}
	
	@Override
	public int updateNotNull(RolePermission rolePermission) {
		return rolePermissionMapper.updateNotNull(rolePermission);
	}
	
	@Override
	public List<RolePermission> findAll() {
		return rolePermissionMapper.loadAll();
	}
	
	@Override
	public RolePermission findById(Integer id) {
		return rolePermissionMapper.load(id);
	}
	
}
