package com.example.demo.service;

import com.example.demo.dao.AdminDao;
import com.example.demo.entity.Admin;
import com.example.demo.entity.Params;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdminService {

    @Resource
    private AdminDao adminDao;

    public List<Admin> getallAdmin() {
//        return AdminDao.getAdmin();
        //3.使用引入的包
        return adminDao.selectAll();
    }

    public List<Admin> findBySearch(Params params) {
        return adminDao.findBySearch(params);
    }
    //引入UserDAo

}
