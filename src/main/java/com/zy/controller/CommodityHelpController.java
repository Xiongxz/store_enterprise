package com.zy.controller;

import com.zy.model.UserInfo;
import com.zy.service.CommodityHelpService;
import com.zy.utils.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by xxz on 2018/4/6 0006.
 */
@RestController
public class CommodityHelpController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CommodityHelpService commodityHelpService;

    @RequestMapping(value={"/login"})
    public ModelAndView index(){
        logger.info("############跳转页面测试############"+"index.html");
        return new ModelAndView("index");
    }

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
        logger.info("########测试mapper通用接口，查询所有########");
        System.out.println("数据 ：" +JacksonUtils.listToJson(commodityHelpService.getAll()));
        return ZYJSONResult.ok(commodityHelpService.getAll());
    }

    @RequestMapping(value = {"/getById"})
    public ZYJSONResult getById(){
        logger.info("########测试mapper自定义sql接口，根据ID查询########");
        Long userId = 2018041016593292800L;
        UserInfo ui=null;
        try {
            ui = commodityHelpService.getById(userId);
            System.out.println("数据 ：" +JacksonUtils.obj2json(ui));
        } catch (Exception e) {
            e.printStackTrace();
            return ZYJSONResult.errorException("系统异常");
        }
        return ZYJSONResult.ok(ui);
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

    @RequestMapping(value={"/uploadFile"},method = RequestMethod.POST)
    public ModelAndView uploadFile(@RequestParam(value = "file",required = false) MultipartFile file, HttpServletRequest request) throws IOException {
        logger.info("#############文件上传---测试#########");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        ModelAndView  model  =  new ModelAndView();
        if (request instanceof MultipartHttpServletRequest && !file.isEmpty() && file.getSize() > 0) {
            String contentType = file.getContentType();
            String fileName = file.getOriginalFilename();
            String newName = Utils.getUUID() + fileName.substring(fileName.lastIndexOf("."));
            String filePath = request.getSession().getServletContext().getRealPath("img/");
            System.out.println("文件类型：" + contentType);
            System.out.println("文件完整路径: " + filePath+newName);
            System.out.println("文件原名称：" + fileName);
            System.out.println("文件新名称：" + newName);
            System.out.println("文件大小：" + file.getSize());
            UserInfo ui = new UserInfo();
            model.addObject("name","img/"+newName);
            model.setViewName("sueess");
            try {
                Utils.uploadFile(file.getBytes(), filePath, newName);
                ui.setUserId(new Date().getTime());
                ui.setUserName(filePath+newName);
                ui.setUserAge(10);
                ui.setStartDate(sdf.parse(DateUtils.getCurrentDateTime()));
                commodityHelpService.save(ui);
                System.out.println("上传成功成功！");
                //return ZYJSONResult.mok("imgurl",filePath + newName);
            } catch (Exception e) {
                //return ZYJSONResult.errorMsg("异常");
            }
        } else {
            //return  ZYJSONResult.errorMsg("文件为空");
        }
        return model;
    }
}
