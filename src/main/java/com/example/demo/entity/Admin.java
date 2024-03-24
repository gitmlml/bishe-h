package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "admin")  //映射
public class Admin {

    @Id
//    @GeneratedValue
    private String Adminname;

    @Column(name = "name")
    private String name;

    @Column(name = "adminpassword")
    private String Adminpasswprd;


    public String getAdminname() {
        return Adminname;
    }

    public void setAdminname(String adminname) {
        Adminname = adminname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdminpasswprd() {
        return Adminpasswprd;
    }

    public void setAdminpasswprd(String adminpasswprd) {
        Adminpasswprd = adminpasswprd;
    }

    public Admin(String name,String Adminname,String Adminpassword){
        this.name = name;
        this.Adminname = Adminname;
        this.Adminpasswprd = Adminpassword;
    }
}
