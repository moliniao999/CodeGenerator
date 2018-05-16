package com.pohoocredit.profitcard.mall.order.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "mall_postage_rule")
public class MallPostageRule {
    /**
     * 规则id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 区间最小值
     */
    @Column(name = "from_begin")
    private Long fromBegin;

    /**
     * 区间最大值
     */
    @Column(name = "from_end")
    private Long fromEnd;

    /**
     * 运费
     */
    private Long postage;

    /**
     * 计价方式：1-按金额，2-按重量, 3-其他;(本次需求只涉及方式1)
     */
    @Column(name = "count_way")
    private Byte countWay;

    /**
     * 是否包邮: 1-包邮, 2-不包邮
     */
    @Column(name = "is_free")
    private Byte isFree;

    /**
     * 区间值单位
     */
    private String unit;

    /**
     * 描述
     */
    private String remark;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 获取规则id
     *
     * @return id - 规则id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置规则id
     *
     * @param id 规则id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取区间最小值
     *
     * @return from_begin - 区间最小值
     */
    public Long getFromBegin() {
        return fromBegin;
    }

    /**
     * 设置区间最小值
     *
     * @param fromBegin 区间最小值
     */
    public void setFromBegin(Long fromBegin) {
        this.fromBegin = fromBegin;
    }

    /**
     * 获取区间最大值
     *
     * @return from_end - 区间最大值
     */
    public Long getFromEnd() {
        return fromEnd;
    }

    /**
     * 设置区间最大值
     *
     * @param fromEnd 区间最大值
     */
    public void setFromEnd(Long fromEnd) {
        this.fromEnd = fromEnd;
    }

    /**
     * 获取运费
     *
     * @return postage - 运费
     */
    public Long getPostage() {
        return postage;
    }

    /**
     * 设置运费
     *
     * @param postage 运费
     */
    public void setPostage(Long postage) {
        this.postage = postage;
    }

    /**
     * 获取计价方式：1-按金额，2-按重量, 3-其他;(本次需求只涉及方式1)
     *
     * @return count_way - 计价方式：1-按金额，2-按重量, 3-其他;(本次需求只涉及方式1)
     */
    public Byte getCountWay() {
        return countWay;
    }

    /**
     * 设置计价方式：1-按金额，2-按重量, 3-其他;(本次需求只涉及方式1)
     *
     * @param countWay 计价方式：1-按金额，2-按重量, 3-其他;(本次需求只涉及方式1)
     */
    public void setCountWay(Byte countWay) {
        this.countWay = countWay;
    }

    /**
     * 获取是否包邮: 1-包邮, 2-不包邮
     *
     * @return is_free - 是否包邮: 1-包邮, 2-不包邮
     */
    public Byte getIsFree() {
        return isFree;
    }

    /**
     * 设置是否包邮: 1-包邮, 2-不包邮
     *
     * @param isFree 是否包邮: 1-包邮, 2-不包邮
     */
    public void setIsFree(Byte isFree) {
        this.isFree = isFree;
    }

    /**
     * 获取区间值单位
     *
     * @return unit - 区间值单位
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 设置区间值单位
     *
     * @param unit 区间值单位
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * 获取描述
     *
     * @return remark - 描述
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置描述
     *
     * @param remark 描述
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}