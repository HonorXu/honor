package com.honor.model;

import java.io.Serializable;


/**
 * 角色
 *
 * @创建者：yulin
 * @创建时间：2016-09-30
 */
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;
    // 编号
    private Integer id;

    // 角色名
    private String name;

    // 描述
    private String description;

    //角色类型（1：业管系统，2：渠道系统）
    private Integer type;

    // 删除标记(0:未删除 1：已删除)
    private Integer deleteFlag;

    //标识字段(是否是管理员)
    private Boolean isManager;

    public Boolean getIsManager() {
        return isManager;
    }
    public void setIsManager(Boolean isManager) {
        this.isManager = isManager;
    }
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
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
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

