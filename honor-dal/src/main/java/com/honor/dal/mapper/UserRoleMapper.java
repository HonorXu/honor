package com.honor.dal.mapper;

import com.honor.model.UserRole;

/**
 * 用户角色数据访问
 *
 * @创建者：honor
 * @创建时间：2018-03-29
 */
public interface UserRoleMapper {

	int insert(UserRole userRole);

	int updateNotNull(UserRole userRole);

	UserRole load(Integer id);

}
