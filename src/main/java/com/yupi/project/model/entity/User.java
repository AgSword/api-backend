package com.yupi.project.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户
 *
 * @TableName user
 */
@TableName(value = "user")
@Data
public class User implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 用户昵称
     */
    @TableField(value = "user_name")
    private String userName;

    /**
     * 账号
     */
    @TableField("user_account")
    private String userAccount;

    /**
     * 用户头像
     */
    @TableField(value = "user_avatar")
    private String userAvatar;

    /**
     * 性别
     */
    private Integer gender;

    /**
     * 用户角色: user, admin
     */
    @TableField(value = "user_role")
    private String userRole;

    /**
     * 密码
     */
    @TableField(value = "user_password")
    private String userPassword;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField("update_time")
    private Date updateTime;

    /**
     * 是否删除
     */
    @TableLogic
    @TableField("is_delete")
    private Integer isDelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}