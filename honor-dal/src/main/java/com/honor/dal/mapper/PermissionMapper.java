package com.honor.dal.mapper;

import java.util.List;

import com.honor.model.Permission;

/**
 * 权限数据访问
 *
 * @创建者：honor
 * @创建时间：2018-03-29
 */
public interface PermissionMapper {

	int insert(Permission permission);

	int delete(Integer id);

	int remove(Integer id);

	int updateNotNull(Permission permission);

	Permission load(Integer id);

	List<Permission> loadAll();
	
	List<Permission> selectByParentId(Integer parentId);
	
	List<Permission> selectByType(Integer type);

}
