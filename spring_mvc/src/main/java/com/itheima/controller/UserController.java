package com.itheima.controller;

import com.itheima.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @author lance huang
 * @create 2023-05-05-9:10
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping(value = "quick",params = {"username"})//用于建立请求url和处理请求方法之间的对应关系
    public String save(){
        System.out.println("controller save running....");
        return "/success";
    }
    @RequestMapping(value = "quick2")//用于建立请求url和处理请求方法之间的对应关系
    public ModelAndView save2(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("username","lancehuang");
        modelAndView.setViewName("success");
        return modelAndView;
    }
    @RequestMapping(value = "quick3")//用于建立请求url和处理请求方法之间的对应关系
    public String save3(Model model){
        model.addAttribute("username","黄亮");
        return "success";
    }
    @RequestMapping(value = "quick4")//用于建立请求url和处理请求方法之间的对应关系
    @ResponseBody//告知springMVC框架 不进行视图跳转，直接进行数据响应
    public String save4(){
        return "hello itheima";
    }

    @RequestMapping(value = "quick14")//用于建立请求url和处理请求方法之间的对应关系
    @ResponseBody//告知springMVC框架 不进行视图跳转，直接进行数据响应
    public void save14(VO vo){
        System.out.println(vo);
    }

    @RequestMapping(value = "quick15")//用于建立请求url和处理请求方法之间的对应关系
    @ResponseBody//告知springMVC框架 不进行视图跳转，直接进行数据响应
    public void save15(@RequestBody(required = false) List<User> userList){
        System.out.println(userList);
    }
    @RequestMapping(value = "/quick22")//用于建立请求url和处理请求方法之间的对应关系
    @ResponseBody//告知springMVC框架 不进行视图跳转，直接进行数据响应
    public void save22(String username, MultipartFile uploadFile) throws IOException {
        System.out.println(username);
        //获取上传文件名称
        String originalFilename = uploadFile.getOriginalFilename();
        uploadFile.transferTo(new File("C:\\"+originalFilename));
    }
}
