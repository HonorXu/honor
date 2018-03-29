package com.honor.Impl;

import com.honor.biz.UserRoleBiz;
import com.honor.dal.mapper.UserRoleMapper;
import com.honor.model.UserRole;

/**
 * 用户角色业务实现
 *
 * @创建者：honor
 * @创建时间：2018-03-29
 */
public class UserRoleBizImpl implements UserRoleBiz {

	private UserRoleMapper userRoleMapper;

	public UserRoleMapper getUserRoleMapper() {
		return userRoleMapper;
	}

	public void setUserRoleMapper(UserRoleMapper userRoleMapper) {
		this.userRoleMapper = userRoleMapper;
	}
	
	@Override
	public int add(UserRole userRole) {
		userRoleMapper.insert(userRole);
		return userRole.getId();
	}
	
	@Override
	public int updateNotNull(UserRole userRole) {
		return userRoleMapper.updateNotNull(userRole);
	}
	
	@Override
	public UserRole findById(Integer id) {
		return userRoleMapper.load(id);
	}
	
}
