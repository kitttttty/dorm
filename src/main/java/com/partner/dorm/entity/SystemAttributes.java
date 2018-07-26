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
 * 基础数据表
 * </p>
 *
 * @author chengliang.luo
 * @since 2018-07-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("dorm_system_attributes")
public class SystemAttributes implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键,自增
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 数据类型(UNIT-单位,货物名-GOODS)
     */
    @TableField("data_type")
    private String dataType;
    /**
     * 数据值
     */
    @TableField("data_value")
    private String dataValue;
    /**
     * 是有有效(0-无效,1-有效)
     */
    private Boolean valid;
    @TableField("parent_id")
    private Integer parentId;
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
