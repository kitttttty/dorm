package com.partner.dorm.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 邮件模板表
 * </p>
 *
 * @author chengliang.luo
 * @since 2018-07-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("dorm_email_template")
public class EmailTemplate implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键,自增
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 模板编号
     */
    @TableField("template_no")
    private String templateNo;
    /**
     * 模板内容
     */
    private String content;
    /**
     * 是有有效(0-无效,1-有效)
     */
    private Boolean valid;
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
