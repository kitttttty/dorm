package com.partner.dorm.entity;

import java.math.BigDecimal;
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
 * 结算表
 * </p>
 *
 * @author chengliang.luo
 * @since 2018-07-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("dorm_settle")
public class Settle implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键,自增
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 结算单编号
     */
    @TableField("settle_no")
    private String settleNo;
    /**
     * 货品名称
     */
    @TableField("goods_name")
    private String goodsName;
    /**
     * 货品数量
     */
    @TableField("goods_num")
    private Double goodsNum;
    /**
     * 金额
     */
    private BigDecimal amount;
    /**
     * 备注
     */
    private String remark;
    /**
     * 应付人ID
     */
    @TableField("payer_id")
    private Integer payerId;
    /**
     * 应付人名称
     */
    @TableField("payer_name")
    private String payerName;
    /**
     * 结算状态(WAIT_SETTLE-待结算,SETTLED-已结算)
     */
    @TableField("settle_status")
    private String settleStatus;
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
