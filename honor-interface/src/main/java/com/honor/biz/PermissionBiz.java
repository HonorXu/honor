package com.honor.biz;

import com.honor.model.Permission;
import java.util.List;

/**
 * 权限业务接口
 *
 * @创建者：honor
 * @创建时间：2018-03-29
 */
public interface PermissionBiz {
	/**
	 * 添加
	 * @param permission
	 * @return 新增对象ID
	 */
	public int add(Permission permission);
	
	/**
	 * 根据ID逻辑删除
	 * @param id
	 * @return
	 */
	public int deleteById(Integer id);
	
	/**
	 * 根据ID物理删除
	 * @param id
	 * @return
	 */
	public int removeById(Integer id);
	
	/**
	 * 更新不为空的属性
	 * @param permission
	 * @return
	 */
	public int updateNotNull(Permission permission);
	
	/**
	 * 根据ID查询
	 * @param id
	 * @return
	 */
	public Permission findById(Integer id);
	
	/**
	 * 
	 * 查询所有
	 * @return
	 */
	public List<Permission> findAll();

	/**
	 * 根据父权限编号查询
	 * @param parentId 父权限编号
	 * @return
	 */
	public List<Permission> findByParentId(Integer parentId);

	/**
	 * 根据权限类型（1：业管系统，2：渠道系统）查询
	 * @param type 权限类型（1：业管系统，2：渠道系统）
	 * @return
	 */
	public List<Permission> findByType(Integer type);
	
}
