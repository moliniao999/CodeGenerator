package com.pohoocredit.profitcard.mall.order.service.impl;

import com.bigsea.sns.service.AbstractService;
import com.pohoocredit.profitcard.mall.order.dao.MallOrderMapper;
import com.pohoocredit.profitcard.mall.order.model.MallOrder;
import com.pohoocredit.profitcard.mall.order.service.MallOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * Created by weili on 2018/05/16.
 */
@Service
public class MallOrderServiceImpl extends AbstractService<MallOrder> implements MallOrderService {

    @Autowired
    private MallOrderMapper mallOrderMapper;

}
