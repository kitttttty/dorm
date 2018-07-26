package com.partner.dorm.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 管理用户信息
 * </p>
 *
 * @author chengliang.luo
 * @since 2018-07-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("dorm_roommate")
public class Roommate implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键,自增
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码,MD5加密
     */
    private String password;
    /**
     * 加密盐值
     */
    private String salt;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 性别
     */
    private Boolean gender;
    /**
     * 联系方式
     */
    private Long mobile;
    /**
     * 角色
     */
    private String role;
    /**
     * 创建人ID
     */
    @TableField("create_user_id")
    private Integer createUserId;
    /**
     * 创建人姓名
     */
    @TableField("create_username")
    private String createUsername;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private LocalDateTime createTime;
    /**
     * 修改人ID
     */
    @TableField("update_user_id")
    private Integer updateUserId;
    /**
     * 修改人姓名
     */
    @TableField("update_username")
    private String updateUsername;
    /**
     * 修改时间
     */
    @TableField("update_time")
    private LocalDateTime updateTime;
}
