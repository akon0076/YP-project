package com.entity;

import javax.persistence.*;

/**
 * Created by Song on 2017/2/15.
 * Model 用户
 */
@Entity
@Table(name = "yp_user")
public class User {
    private Integer id;
    private String code;
    private String name;
    private String phone;
    private String password;

    public User(Integer id, String code, String name, String phone, String password) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.phone = phone;
        this.password = password;
    }

    public User() {
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}