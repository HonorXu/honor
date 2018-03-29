package com.honor.model;

import java.io.Serializable;

/**
 * 权限
 *
 * @创建者：yulin
 * @创建时间：2016-09-30
 */
public class Permission implements Serializable {

    private static final long serialVersionUID = 1L;
    // 编号
    private Integer id;

    // 权限名称
    private String name;

    // 权限代码
    private String code;

    // 父权限编号
    private Integer parentId;
    
    //权限类型（1：业管系统，2：渠道系统）
    private Integer type;

    // 删除标记(0:未删除 1：已删除)
    private Integer deleteFlag;


    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public Integer getParentId() {
        return parentId;
    }
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
    public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getDeleteFlag() {
        return deleteFlag;
    }
    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

}

