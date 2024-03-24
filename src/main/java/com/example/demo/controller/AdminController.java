package com.example.demo.controller;

import com.example.demo.common.Result;
import com.example.demo.entity.Admin;
import com.example.demo.entity.Params;
import com.example.demo.service.AdminService;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin  //解决跨域
@RestController
@RequestMapping("/admin")
//接口指类里面的方法 一个方法对应一个接口 (web项目接口的入口)
// 可以在方法前再设设置一个url
//  也可以指定请求方式：GET POST PUT DELETE
public class AdminController {

    @Resource
    //引入service层
    private AdminService adminService;

//    @GetMapping("/start")
//    public Result start(){
//        return Result.success("chenggong");
//    }

    //获取所有管理员
    @GetMapping
    public Result getallAdmin(){
        List<Admin> list = adminService.getallAdmin();
        return Result.success(list);
    }

    @GetMapping("/searchAdmin")
    public Result findBySearch(Params params){
        List<Admin>  list = adminService.findBySearch(params);
        return Result.success(list);
    }
}
