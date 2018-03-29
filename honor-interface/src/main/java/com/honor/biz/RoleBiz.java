package com.honor.biz;

import java.util.List;

import com.honor.model.Role;

/**
 * 角色业务接口
 *
 * @创建者：honor
 * @创建时间：2018-03-29
 */
public interface RoleBiz {
	/**
	 * 添加
	 * @param role
	 * @return 新增对象ID
	 */
	public int add(Role role);
	
	/**
	 * 根据ID逻辑删除
	 * @param id
	 * @return
	 */
	public int deleteById(Integer id);
	
	/**
	 * 更新不为空的属性
	 * @param role
	 * @return
	 */
	public int updateNotNull(Role role);
	
	/**
	 * 根据ID查询
	 * @param id
	 * @return
	 */
	public Role findById(Integer id);
	
	/**
	 * 
	 * 查询所有
	 * @return
	 */
	public List<Role> findAll();

	/**
	 * 根据角色类型（1：业管系统，2：渠道系统）查询
	 * @param type 角色类型（1：业管系统，2：渠道系统）
	 * @return
	 */
	public List<Role> findByType(Integer type);
	
}
