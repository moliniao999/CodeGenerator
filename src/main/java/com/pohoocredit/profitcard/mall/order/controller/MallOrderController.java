package com.pohoocredit.profitcard.mall.order.controller;
import com.pohoocredit.profitcard.mall.order.model.MallOrder;
import com.pohoocredit.profitcard.mall.order.service.MallOrderService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 *
 * Created by weili on 2018/05/16.
 */
@Controller
@RequestMapping("/mallOrder/")
public class MallOrderController {

    @Autowired
    MallOrderService mallOrderService;

    @RequestMapping("add")
    @ResponseBody
    public String add(MallOrder mallOrder) {
        mallOrderService.save(mallOrder);
        return "";
    }

    @RequestMapping("delete")
    @ResponseBody
    public String delete(@RequestParam Integer id) {
	    mallOrderService.deleteById(id);
	    return "";
    }

    @RequestMapping("update")
    @ResponseBody
    public String update(MallOrder mallOrder) {
	    mallOrderService.update(mallOrder);
	    return "";
    }

    @RequestMapping("detail")
    @ResponseBody
    public String detail(@RequestParam Integer id) {
        MallOrder mallOrder = mallOrderService.findById(id);
        return mallOrder.toString();
    }

    @RequestMapping("list")
    @ResponseBody
    public String list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<MallOrder> list = mallOrderService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return list.toString();
    }
}
