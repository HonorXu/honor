package com.honor.Impl;

import java.util.List;

import com.honor.biz.RoleBiz;
import com.honor.dal.mapper.RoleMapper;
import com.honor.model.Role;

/**
 * 角色业务实现
 *
 * @创建者：honor
 * @创建时间：2018-03-29
 */
public class RoleBizImpl implements RoleBiz {

	private RoleMapper roleMapper;

	public RoleMapper getRoleMapper() {
		return roleMapper;
	}

	public void setRoleMapper(RoleMapper roleMapper) {
		this.roleMapper = roleMapper;
	}
	
	@Override
	public int add(Role role) {
		roleMapper.insert(role);
		return role.getId();
	}
	
	@Override
	public int deleteById(Integer id) {
		return roleMapper.delete(id);
	}
	
	@Override
	public int updateNotNull(Role role) {
		return roleMapper.updateNotNull(role);
	}
	
	@Override
	public List<Role> findAll() {
		return roleMapper.loadAll();
	}
	
	@Override
	public Role findById(Integer id) {
		return roleMapper.load(id);
	}
	
	@Override
	public List<Role> findByType(Integer type) {
		return roleMapper.selectByType(type);
	}
	
}
