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
 * 室费表
 * </p>
 *
 * @author chengliang.luo
 * @since 2018-07-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("dorm_public_fee")
public class PublicFee implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键,自增
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 费用单编号
     */
    @TableField("bill_no")
    private String billNo;
    /**
     * 费用类型(EXPEND-支出,INCOME-收入)
     */
    @TableField("fee_type")
    private String feeType;
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
     * 是否已结算(WAIT_SETTLE-待结算,SETTLED-已结算)
     */
    private String settled;
    /**
     * 备注
     */
    private String remark;
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
