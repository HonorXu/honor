package com.honor.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.honor.biz.UserRoleBiz;
import com.honor.dal.mapper.UserRoleMapper;
import com.honor.model.UserRole;

/**
 * 用户角色业务实现
 *
 * @创建者：honor
 * @创建时间：2018-03-29
 */
@Service
public class UserRoleBizImpl implements UserRoleBiz {
	
	@Autowired
	private UserRoleMapper userRoleMapper;

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
