package com.honor.biz;

import com.honor.model.UserRole;

/**
 * 用户角色业务接口
 *
 * @创建者：honor
 * @创建时间：2018-03-29
 */
public interface UserRoleBiz {
	/**
	 * 添加
	 * @param userRole
	 * @return 新增对象ID
	 */
	public int add(UserRole userRole);
	
	/**
	 * 更新不为空的属性
	 * @param userRole
	 * @return
	 */
	public int updateNotNull(UserRole userRole);
	
	/**
	 * 根据ID查询
	 * @param id
	 * @return
	 */
	public UserRole findById(Integer id);
	
}
