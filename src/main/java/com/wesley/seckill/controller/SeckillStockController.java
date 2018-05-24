package com.wesley.seckill.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wesley.seckill.model.SeckillStock;
import com.wesley.seckill.service.SeckillStockService;
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
@RequestMapping("/seckillStock/")
@Slf4j
public class SeckillStockController {

    @Autowired
    SeckillStockService seckillStockService;

    @PostMapping("add")
    public String add(SeckillStock seckillStock) {
        seckillStockService.save(seckillStock);
        return "";
    }

    @GetMapping("delete")
    public String delete(@RequestParam Integer id) {
	    seckillStockService.deleteById(id);
	    return "";
    }

    @PostMapping("update")
    public String update(SeckillStock seckillStock) {
	    seckillStockService.update(seckillStock);
	    return "";
    }

    @GetMapping("detail")
    public String detail(@RequestParam Integer id) {
        SeckillStock seckillStock = seckillStockService.findById(id);
        return seckillStock.toString();
    }

    @GetMapping("list")
    public String list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<SeckillStock> list = seckillStockService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return list.toString();
    }
}
