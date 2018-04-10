package com.zy.controller;

import com.sun.deploy.util.StringUtils;
import com.zy.model.UserInfo;
import com.zy.service.CommodityHelpService;
import com.zy.utils.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by xxz on 2018/4/6 0006.
 */
@RestController
public class CommodityHelpController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CommodityHelpService commodityHelpService;

    @RequestMapping(value = {"/log"},method = RequestMethod.GET)
    public ModelAndView login(){
        logger.info("日志测试");
        //logger.debug("This is a debug message");
        //logger.info("This is an info message");
        //logger.warn("This is a warn message");
        //logger.error("This is an error message");
        //new LogHelper().helpMethod();
        return new ModelAndView("/index");
    }

    @RequestMapping(value = {"/selectAll"})
    public ZYJSONResult selectAll(){
        logger.info("测试mapper通用接口，查询所有");
        System.out.println("数据 ：" +JacksonUtils.listToJson(commodityHelpService.selectAll()));
        return ZYJSONResult.ok(commodityHelpService.selectAll());
    }

    @RequestMapping(value = {"/saveUserInfo"})
    public ZYJSONResult saveUserInfo(){
        logger.info("测试mapper通用接口，添加ONE");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        UserInfo userInfo = new UserInfo();
        try {
            userInfo.setUserId(SidWorker.nextSid());
            userInfo.setUserAge(15);
            userInfo.setUserName("测试");
            userInfo.setStartDate(sdf.parse(DateUtils.getCurrentDateTime()));
            commodityHelpService.save(userInfo);
        }catch (Exception e){
            logger.info("添加失败");
            return ZYJSONResult.errorException("系统异常");
        }
        logger.info("添加成功");
        return ZYJSONResult.ok("保存成功");
    }
}
