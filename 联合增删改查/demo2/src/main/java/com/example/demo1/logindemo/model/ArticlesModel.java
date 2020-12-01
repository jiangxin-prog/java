package com.example.demo1.logindemo.model;

import java.util.List;

public class ArticlesModel<T> {

    private List<T> list ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    private String name;

    private String pwd;

}