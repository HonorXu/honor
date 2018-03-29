package com.honor.dal.mapper;

import java.util.List;

import com.honor.model.RolePermission;

/**
 * 角色权限数据访问
 *
 * @创建者：honor
 * @创建时间：2018-03-29
 */
public interface RolePermissionMapper {

	int insert(RolePermission rolePermission);

	int updateNotNull(RolePermission rolePermission);

	RolePermission load(Integer id);

	List<RolePermission> loadAll();

}
