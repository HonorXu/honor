package com.honor.dal.mapper;

import java.util.List;

import com.honor.model.Role;

/**
 * 角色数据访问
 *
 * @创建者：honor
 * @创建时间：2018-03-29
 */
public interface RoleMapper {

	int insert(Role role);

	int delete(Integer id);

	int updateNotNull(Role role);

	Role load(Integer id);

	List<Role> loadAll();
	
	List<Role> selectByType(Integer type);

}
