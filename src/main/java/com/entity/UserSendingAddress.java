package com.entity;

import javax.persistence.*;

@Entity
@Table(name = "yp_user_sending_address")
public class UserSendingAddress {
    private Integer id;
    private Integer userId;
    private String address;
    private String name;
    private String phone;

    public UserSendingAddress(Integer id, Integer userId, String address, String name, String phone) {
        this.id = id;
        this.userId = userId;
        this.address = address;
        this.name = name;
        this.phone = phone;
    }

    public UserSendingAddress() {
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
}
