package com.pohoocredit.profitcard.mall.order.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "mall_order")
public class MallOrder {
    /**
     * 订单编号，唯一，系统生成
     */
    @Id
    @Column(name = "order_id")
    private Long orderId;

    /**
     * 客户编号
     */
    @Column(name = "cust_id")
    private String custId;

    /**
     * 协议价（采购价）总价
     */
    @Column(name = "purchase_total_amount")
    private BigDecimal purchaseTotalAmount;

    /**
     * 金融产品Id
     */
    @Column(name = "financial_product_id")
    private String financialProductId;

    /**
     * 金融产品名称
     */
    @Column(name = "financial_product_name")
    private String financialProductName;

    /**
     * 金融产品分期数
     */
    private Byte periods;

    /**
     * 分期付款金额
     */
    @Column(name = "installment_amount")
    private BigDecimal installmentAmount;

    /**
     * 支付金额
     */
    @Column(name = "pay_total_amount")
    private BigDecimal payTotalAmount;

    /**
     * 总金额
     */
    @Column(name = "commodity_total_amount")
    private BigDecimal commodityTotalAmount;

    /**
     * 商品总数
     */
    private Byte quantity;

    /**
     * 优惠金额
     */
    @Column(name = "discount_amount")
    private BigDecimal discountAmount;

    /**
     * 买家姓名
     */
    @Column(name = "buyer_name")
    private String buyerName;

    /**
     * 买家联系方式
     */
    @Column(name = "buyer_phone")
    private String buyerPhone;

    /**
     * 订单状态
     */
    @Column(name = "order_status")
    private String orderStatus;

    /**
     * 订单主状态
     */
    @Column(name = "order_main_status")
    private String orderMainStatus;

    /**
     * 状态描述
     */
    @Column(name = "status_desc")
    private String statusDesc;

    /**
     * 运费支付方式
     */
    @Column(name = "freight_pay_tpye")
    private String freightPayTpye;

    /**
     * 运费总价
     */
    @Column(name = "freight_total_amount")
    private BigDecimal freightTotalAmount;

    /**
     * 供应商 01 ->jd
     */
    private Integer supplier;

    /**
     * 供应商订单编号
     */
    @Column(name = "supplier_order_num")
    private String supplierOrderNum;

    /**
     * 支付给供应商的结算方式 1->京东-在线支付（余额支付）
     */
    @Column(name = "supplier_pay_type")
    private Byte supplierPayType;

    /**
     * 付款给供应商的时间
     */
    @Column(name = "supplier_pay_time")
    private String supplierPayTime;

    /**
     * 收件时间
     */
    @Column(name = "addressee_receipt_time")
    private String addresseeReceiptTime;

    /**
     * 配送方式 1->京东快递
     */
    @Column(name = "delivery_type")
    private Byte deliveryType;

    /**
     * 是否客户端展示，0：不展示，1：展示，订单创建时默认为1
     */
    @Column(name = "client_display")
    private Byte clientDisplay;

    /**
     * 订单合同号
     */
    @Column(name = "loan_no")
    private String loanNo;

    /**
     * 创建时间(下单时间)
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 积分金额
     */
    @Column(name = "trade_points_amount")
    private BigDecimal tradePointsAmount;

    /**
     * 支付类型：默认为为0
值：
0：利卡支付
1：微信支付
2：0元支付
     */
    @Column(name = "pay_type")
    private Byte payType;

    /**
     * 支付中开始时间
     */
    @Column(name = "pay_created_time")
    private Date payCreatedTime;

    /**
     * 支付完成时间
     */
    @Column(name = "pay_finished_time")
    private Date payFinishedTime;

    /**
     * 默认0，
0 不使用积分
1冻结中，2已消费完成，3取消
     */
    @Column(name = "trade_points_status")
    private Byte tradePointsStatus;

    /**
     * 获取订单编号，唯一，系统生成
     *
     * @return order_id - 订单编号，唯一，系统生成
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * 设置订单编号，唯一，系统生成
     *
     * @param orderId 订单编号，唯一，系统生成
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取客户编号
     *
     * @return cust_id - 客户编号
     */
    public String getCustId() {
        return custId;
    }

    /**
     * 设置客户编号
     *
     * @param custId 客户编号
     */
    public void setCustId(String custId) {
        this.custId = custId;
    }

    /**
     * 获取协议价（采购价）总价
     *
     * @return purchase_total_amount - 协议价（采购价）总价
     */
    public BigDecimal getPurchaseTotalAmount() {
        return purchaseTotalAmount;
    }

    /**
     * 设置协议价（采购价）总价
     *
     * @param purchaseTotalAmount 协议价（采购价）总价
     */
    public void setPurchaseTotalAmount(BigDecimal purchaseTotalAmount) {
        this.purchaseTotalAmount = purchaseTotalAmount;
    }

    /**
     * 获取金融产品Id
     *
     * @return financial_product_id - 金融产品Id
     */
    public String getFinancialProductId() {
        return financialProductId;
    }

    /**
     * 设置金融产品Id
     *
     * @param financialProductId 金融产品Id
     */
    public void setFinancialProductId(String financialProductId) {
        this.financialProductId = financialProductId;
    }

    /**
     * 获取金融产品名称
     *
     * @return financial_product_name - 金融产品名称
     */
    public String getFinancialProductName() {
        return financialProductName;
    }

    /**
     * 设置金融产品名称
     *
     * @param financialProductName 金融产品名称
     */
    public void setFinancialProductName(String financialProductName) {
        this.financialProductName = financialProductName;
    }

    /**
     * 获取金融产品分期数
     *
     * @return periods - 金融产品分期数
     */
    public Byte getPeriods() {
        return periods;
    }

    /**
     * 设置金融产品分期数
     *
     * @param periods 金融产品分期数
     */
    public void setPeriods(Byte periods) {
        this.periods = periods;
    }

    /**
     * 获取分期付款金额
     *
     * @return installment_amount - 分期付款金额
     */
    public BigDecimal getInstallmentAmount() {
        return installmentAmount;
    }

    /**
     * 设置分期付款金额
     *
     * @param installmentAmount 分期付款金额
     */
    public void setInstallmentAmount(BigDecimal installmentAmount) {
        this.installmentAmount = installmentAmount;
    }

    /**
     * 获取支付金额
     *
     * @return pay_total_amount - 支付金额
     */
    public BigDecimal getPayTotalAmount() {
        return payTotalAmount;
    }

    /**
     * 设置支付金额
     *
     * @param payTotalAmount 支付金额
     */
    public void setPayTotalAmount(BigDecimal payTotalAmount) {
        this.payTotalAmount = payTotalAmount;
    }

    /**
     * 获取总金额
     *
     * @return commodity_total_amount - 总金额
     */
    public BigDecimal getCommodityTotalAmount() {
        return commodityTotalAmount;
    }

    /**
     * 设置总金额
     *
     * @param commodityTotalAmount 总金额
     */
    public void setCommodityTotalAmount(BigDecimal commodityTotalAmount) {
        this.commodityTotalAmount = commodityTotalAmount;
    }

    /**
     * 获取商品总数
     *
     * @return quantity - 商品总数
     */
    public Byte getQuantity() {
        return quantity;
    }

    /**
     * 设置商品总数
     *
     * @param quantity 商品总数
     */
    public void setQuantity(Byte quantity) {
        this.quantity = quantity;
    }

    /**
     * 获取优惠金额
     *
     * @return discount_amount - 优惠金额
     */
    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    /**
     * 设置优惠金额
     *
     * @param discountAmount 优惠金额
     */
    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    /**
     * 获取买家姓名
     *
     * @return buyer_name - 买家姓名
     */
    public String getBuyerName() {
        return buyerName;
    }

    /**
     * 设置买家姓名
     *
     * @param buyerName 买家姓名
     */
    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    /**
     * 获取买家联系方式
     *
     * @return buyer_phone - 买家联系方式
     */
    public String getBuyerPhone() {
        return buyerPhone;
    }

    /**
     * 设置买家联系方式
     *
     * @param buyerPhone 买家联系方式
     */
    public void setBuyerPhone(String buyerPhone) {
        this.buyerPhone = buyerPhone;
    }

    /**
     * 获取订单状态
     *
     * @return order_status - 订单状态
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * 设置订单状态
     *
     * @param orderStatus 订单状态
     */
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * 获取订单主状态
     *
     * @return order_main_status - 订单主状态
     */
    public String getOrderMainStatus() {
        return orderMainStatus;
    }

    /**
     * 设置订单主状态
     *
     * @param orderMainStatus 订单主状态
     */
    public void setOrderMainStatus(String orderMainStatus) {
        this.orderMainStatus = orderMainStatus;
    }

    /**
     * 获取状态描述
     *
     * @return status_desc - 状态描述
     */
    public String getStatusDesc() {
        return statusDesc;
    }

    /**
     * 设置状态描述
     *
     * @param statusDesc 状态描述
     */
    public void setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
    }

    /**
     * 获取运费支付方式
     *
     * @return freight_pay_tpye - 运费支付方式
     */
    public String getFreightPayTpye() {
        return freightPayTpye;
    }

    /**
     * 设置运费支付方式
     *
     * @param freightPayTpye 运费支付方式
     */
    public void setFreightPayTpye(String freightPayTpye) {
        this.freightPayTpye = freightPayTpye;
    }

    /**
     * 获取运费总价
     *
     * @return freight_total_amount - 运费总价
     */
    public BigDecimal getFreightTotalAmount() {
        return freightTotalAmount;
    }

    /**
     * 设置运费总价
     *
     * @param freightTotalAmount 运费总价
     */
    public void setFreightTotalAmount(BigDecimal freightTotalAmount) {
        this.freightTotalAmount = freightTotalAmount;
    }

    /**
     * 获取供应商 01 ->jd
     *
     * @return supplier - 供应商 01 ->jd
     */
    public Integer getSupplier() {
        return supplier;
    }

    /**
     * 设置供应商 01 ->jd
     *
     * @param supplier 供应商 01 ->jd
     */
    public void setSupplier(Integer supplier) {
        this.supplier = supplier;
    }

    /**
     * 获取供应商订单编号
     *
     * @return supplier_order_num - 供应商订单编号
     */
    public String getSupplierOrderNum() {
        return supplierOrderNum;
    }

    /**
     * 设置供应商订单编号
     *
     * @param supplierOrderNum 供应商订单编号
     */
    public void setSupplierOrderNum(String supplierOrderNum) {
        this.supplierOrderNum = supplierOrderNum;
    }

    /**
     * 获取支付给供应商的结算方式 1->京东-在线支付（余额支付）
     *
     * @return supplier_pay_type - 支付给供应商的结算方式 1->京东-在线支付（余额支付）
     */
    public Byte getSupplierPayType() {
        return supplierPayType;
    }

    /**
     * 设置支付给供应商的结算方式 1->京东-在线支付（余额支付）
     *
     * @param supplierPayType 支付给供应商的结算方式 1->京东-在线支付（余额支付）
     */
    public void setSupplierPayType(Byte supplierPayType) {
        this.supplierPayType = supplierPayType;
    }

    /**
     * 获取付款给供应商的时间
     *
     * @return supplier_pay_time - 付款给供应商的时间
     */
    public String getSupplierPayTime() {
        return supplierPayTime;
    }

    /**
     * 设置付款给供应商的时间
     *
     * @param supplierPayTime 付款给供应商的时间
     */
    public void setSupplierPayTime(String supplierPayTime) {
        this.supplierPayTime = supplierPayTime;
    }

    /**
     * 获取收件时间
     *
     * @return addressee_receipt_time - 收件时间
     */
    public String getAddresseeReceiptTime() {
        return addresseeReceiptTime;
    }

    /**
     * 设置收件时间
     *
     * @param addresseeReceiptTime 收件时间
     */
    public void setAddresseeReceiptTime(String addresseeReceiptTime) {
        this.addresseeReceiptTime = addresseeReceiptTime;
    }

    /**
     * 获取配送方式 1->京东快递
     *
     * @return delivery_type - 配送方式 1->京东快递
     */
    public Byte getDeliveryType() {
        return deliveryType;
    }

    /**
     * 设置配送方式 1->京东快递
     *
     * @param deliveryType 配送方式 1->京东快递
     */
    public void setDeliveryType(Byte deliveryType) {
        this.deliveryType = deliveryType;
    }

    /**
     * 获取是否客户端展示，0：不展示，1：展示，订单创建时默认为1
     *
     * @return client_display - 是否客户端展示，0：不展示，1：展示，订单创建时默认为1
     */
    public Byte getClientDisplay() {
        return clientDisplay;
    }

    /**
     * 设置是否客户端展示，0：不展示，1：展示，订单创建时默认为1
     *
     * @param clientDisplay 是否客户端展示，0：不展示，1：展示，订单创建时默认为1
     */
    public void setClientDisplay(Byte clientDisplay) {
        this.clientDisplay = clientDisplay;
    }

    /**
     * 获取订单合同号
     *
     * @return loan_no - 订单合同号
     */
    public String getLoanNo() {
        return loanNo;
    }

    /**
     * 设置订单合同号
     *
     * @param loanNo 订单合同号
     */
    public void setLoanNo(String loanNo) {
        this.loanNo = loanNo;
    }

    /**
     * 获取创建时间(下单时间)
     *
     * @return create_time - 创建时间(下单时间)
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间(下单时间)
     *
     * @param createTime 创建时间(下单时间)
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

    /**
     * 获取积分金额
     *
     * @return trade_points_amount - 积分金额
     */
    public BigDecimal getTradePointsAmount() {
        return tradePointsAmount;
    }

    /**
     * 设置积分金额
     *
     * @param tradePointsAmount 积分金额
     */
    public void setTradePointsAmount(BigDecimal tradePointsAmount) {
        this.tradePointsAmount = tradePointsAmount;
    }

    /**
     * 获取支付类型：默认为为0
值：
0：利卡支付
1：微信支付
2：0元支付
     *
     * @return pay_type - 支付类型：默认为为0
值：
0：利卡支付
1：微信支付
2：0元支付
     */
    public Byte getPayType() {
        return payType;
    }

    /**
     * 设置支付类型：默认为为0
值：
0：利卡支付
1：微信支付
2：0元支付
     *
     * @param payType 支付类型：默认为为0
值：
0：利卡支付
1：微信支付
2：0元支付
     */
    public void setPayType(Byte payType) {
        this.payType = payType;
    }

    /**
     * 获取支付中开始时间
     *
     * @return pay_created_time - 支付中开始时间
     */
    public Date getPayCreatedTime() {
        return payCreatedTime;
    }

    /**
     * 设置支付中开始时间
     *
     * @param payCreatedTime 支付中开始时间
     */
    public void setPayCreatedTime(Date payCreatedTime) {
        this.payCreatedTime = payCreatedTime;
    }

    /**
     * 获取支付完成时间
     *
     * @return pay_finished_time - 支付完成时间
     */
    public Date getPayFinishedTime() {
        return payFinishedTime;
    }

    /**
     * 设置支付完成时间
     *
     * @param payFinishedTime 支付完成时间
     */
    public void setPayFinishedTime(Date payFinishedTime) {
        this.payFinishedTime = payFinishedTime;
    }

    /**
     * 获取默认0，
0 不使用积分
1冻结中，2已消费完成，3取消
     *
     * @return trade_points_status - 默认0，
0 不使用积分
1冻结中，2已消费完成，3取消
     */
    public Byte getTradePointsStatus() {
        return tradePointsStatus;
    }

    /**
     * 设置默认0，
0 不使用积分
1冻结中，2已消费完成，3取消
     *
     * @param tradePointsStatus 默认0，
0 不使用积分
1冻结中，2已消费完成，3取消
     */
    public void setTradePointsStatus(Byte tradePointsStatus) {
        this.tradePointsStatus = tradePointsStatus;
    }
}