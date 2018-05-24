package com.wesley.seckill.service.impl;

import com.wesley.seckill.dao.SeckillStockMapper;
import com.wesley.seckill.model.SeckillStock;
import com.wesley.seckill.service.AbstractService;
import com.wesley.seckill.service.SeckillStockService;
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
public class SeckillStockServiceImpl extends AbstractService<SeckillStock> implements SeckillStockService {

    @Autowired
    private SeckillStockMapper seckillStockMapper;

}
