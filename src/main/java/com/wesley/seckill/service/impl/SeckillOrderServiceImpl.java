package com.wesley.seckill.service.impl;

import com.wesley.seckill.dao.SeckillOrderMapper;
import com.wesley.seckill.model.SeckillOrder;
import com.wesley.seckill.service.AbstractService;
import com.wesley.seckill.service.SeckillOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @description:
* @author: weili
* @create: 2018-05-24
*/
@Service
@Slf4j
public class SeckillOrderServiceImpl extends AbstractService<SeckillOrder> implements SeckillOrderService {

    @Autowired
    private SeckillOrderMapper seckillOrderMapper;

}
