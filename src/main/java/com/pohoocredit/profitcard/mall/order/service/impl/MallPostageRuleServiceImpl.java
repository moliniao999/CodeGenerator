package com.pohoocredit.profitcard.mall.order.service.impl;

import com.pohoocredit.profitcard.mall.order.dao.MallPostageRuleMapper;
import com.pohoocredit.profitcard.mall.order.model.MallPostageRule;
import com.pohoocredit.profitcard.mall.order.service.MallPostageRuleService;
import com.pohoocredit.profitcard.mall.order.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
* @description:
* @author: weili
* @create: 2018/05/16
*/
@Service
public class MallPostageRuleServiceImpl extends AbstractService<MallPostageRule> implements MallPostageRuleService {

    @Autowired
    private MallPostageRuleMapper mallPostageRuleMapper;

}
