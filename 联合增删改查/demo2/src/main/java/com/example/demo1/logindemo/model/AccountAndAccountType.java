package com.example.demo1.logindemo.model;

public class AccountAndAccountType {

    private Integer id;

    private Integer accountTypeId;

    private Integer status;

    private String name;

    private String pwd;


    private String accountTypeName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAccountTypeId() {
        return accountTypeId;
    }

    public void setAccountTypeId(Integer accountTypeId) {
        this.accountTypeId = accountTypeId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public String getAccountTypeName() {
        return accountTypeName;
    }

    public void setAccountTypeName(String accountTypeName) {
        this.accountTypeName = accountTypeName;
    }
//    @Override
//    public String toString() {
//        return "AccountAndAccountType{" +
//                "id=" + id +
//                ", status=" + status +
//                ", name='" + name + '\'' +
//                ", pwd='" + pwd + '\'' +
//                ", accontTypeId=" + accontTypeId +
//                ", accontTypeName='" + accontTypeName + '\'' +
//                '}';
//    }
}