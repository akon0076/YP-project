package com.entity;

import javax.persistence.*;

@Entity
@Table(name = "yp_area")
public class Area {
    private Integer id;
    private String address;

    public Area(Integer id, String address) {
        this.id = id;
        this.address = address;
    }

    public Area() {
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
