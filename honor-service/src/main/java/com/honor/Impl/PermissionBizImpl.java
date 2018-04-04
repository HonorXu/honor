package com.honor.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.honor.biz.PermissionBiz;
import com.honor.dal.mapper.PermissionMapper;
import com.honor.model.Permission;

/**
 * 权限业务实现
 *
 * @创建者：honor
 * @创建时间：2018-03-29
 */
@Service
public class PermissionBizImpl implements PermissionBiz {
	
	@Autowired
	private PermissionMapper permissionMapper;

	@Override
	public int add(Permission permission) {
		permissionMapper.insert(permission);
		return permission.getId();
	}
	
	@Override
	public int deleteById(Integer id) {
		return permissionMapper.delete(id);
	}
	
	@Override
	public int removeById(Integer id) {
		return permissionMapper.remove(id);
	}
	
	@Override
	public int updateNotNull(Permission permission) {
		return permissionMapper.updateNotNull(permission);
	}
	
	@Override
	public List<Permission> findAll() {
		return permissionMapper.loadAll();
	}
	
	@Override
	public Permission findById(Integer id) {
		return permissionMapper.load(id);
	}
	
	@Override
	public List<Permission> findByParentId(Integer parentId) {
		return permissionMapper.selectByParentId(parentId);
	}
	
	@Override
	public List<Permission> findByType(Integer type) {
		return permissionMapper.selectByType(type);
	}
	
}
