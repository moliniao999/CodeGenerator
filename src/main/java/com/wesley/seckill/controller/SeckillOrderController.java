package com.wesley.seckill.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wesley.seckill.model.SeckillOrder;
import com.wesley.seckill.service.SeckillOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
* @description:
* @author: weili
* @create: 2018-05-24
*/
@RestController
@RequestMapping("/seckillOrder/")
@Slf4j
public class SeckillOrderController {

    @Autowired
    SeckillOrderService seckillOrderService;

    @PostMapping("add")
    public String add(SeckillOrder seckillOrder) {
        seckillOrderService.save(seckillOrder);
        return "";
    }

    @GetMapping("delete")
    public String delete(@RequestParam Integer id) {
	    seckillOrderService.deleteById(id);
	    return "";
    }

    @PostMapping("update")
    public String update(SeckillOrder seckillOrder) {
	    seckillOrderService.update(seckillOrder);
	    return "";
    }

    @GetMapping("detail")
    public String detail(@RequestParam Integer id) {
        SeckillOrder seckillOrder = seckillOrderService.findById(id);
        return seckillOrder.toString();
    }

    @GetMapping("list")
    public String list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<SeckillOrder> list = seckillOrderService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return list.toString();
    }
}
