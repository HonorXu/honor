package com.honor.biz;

import java.util.List;

import com.honor.model.RolePermission;

/**
 * 角色权限业务接口
 *
 * @创建者：honor
 * @创建时间：2018-03-29
 */
public interface RolePermissionBiz {
	/**
	 * 添加
	 * @param rolePermission
	 * @return 新增对象ID
	 */
	public int add(RolePermission rolePermission);
	
	/**
	 * 更新不为空的属性
	 * @param rolePermission
	 * @return
	 */
	public int updateNotNull(RolePermission rolePermission);
	
	/**
	 * 根据ID查询
	 * @param id
	 * @return
	 */
	public RolePermission findById(Integer id);
	
	/**
	 * 
	 * 查询所有
	 * @return
	 */
	public List<RolePermission> findAll();
	
}
