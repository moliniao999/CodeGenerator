package com.pohoocredit.profitcard.mall.order.controller;
import com.pohoocredit.profitcard.mall.order.model.MallPostageRule;
import com.pohoocredit.profitcard.mall.order.service.MallPostageRuleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
* @description:
* @author: weili
* @create: 2018/05/16
*/

@Controller
@RequestMapping("/mallPostageRule/")
public class MallPostageRuleController {

    @Autowired
    MallPostageRuleService mallPostageRuleService;

    @RequestMapping("add")
    @ResponseBody
    public String add(MallPostageRule mallPostageRule) {
        mallPostageRuleService.save(mallPostageRule);
        return "";
    }

    @RequestMapping("delete")
    @ResponseBody
    public String delete(@RequestParam Integer id) {
	    mallPostageRuleService.deleteById(id);
	    return "";
    }

    @RequestMapping("update")
    @ResponseBody
    public String update(MallPostageRule mallPostageRule) {
	    mallPostageRuleService.update(mallPostageRule);
	    return "";
    }

    @RequestMapping("detail")
    @ResponseBody
    public String detail(@RequestParam Integer id) {
        MallPostageRule mallPostageRule = mallPostageRuleService.findById(id);
        return mallPostageRule.toString();
    }

    @RequestMapping("list")
    @ResponseBody
    public String list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<MallPostageRule> list = mallPostageRuleService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return list.toString();
    }
}
