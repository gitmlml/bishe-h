package com.example.demo.dao;

import com.example.demo.entity.Admin;
import com.example.demo.entity.Params;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;


import java.util.List;

@Repository
//表示该持久层操作User对象对对应的user表
public interface AdminDao extends Mapper<Admin> {

    //1.基于注解的方式
    //@Select("select * fromAdmin user")
//    List<Admin> getAdmin();

    List<Admin> findBySearch(@Param("params")Params params);
}
