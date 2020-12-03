package com.broit.day120301.controller;

import com.broit.day120301.entity.UserInfo;
import com.broit.day120301.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class UserController {
    @Resource
    private UserService userService;
//删除
    @RequestMapping("/deleteUserById")
    public String deleteUserById(Integer id, HttpServletResponse response){
        userService.deleteUserById(id);
        return "redirect:getUserList";
    }
//用户列表
    @RequestMapping("/getUserList")
    public String getUserList(Model model){
        List<UserInfo> list = userService.getUserList();
        model.addAttribute("list", list);
        System.out.println(list);
        return "user_list";
    }
//修改
    @RequestMapping("/toUpdateUser")
    public String toUpdateUser(Model model,Integer id){
        UserInfo userInfo = userService.getUserById(id);
        model.addAttribute("userInfo", userInfo);
        System.out.println(userInfo);
        return "user_update";
    }
}
