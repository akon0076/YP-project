package com.entity;

import javax.persistence.*;

@Entity
@Table(name = "yp_administrator")
public class Administrator {
    private Integer id;
    private String code;
    private Integer gender;
    private String nation;
    private String education;
    private String description;
    private String status;
    private String name;
    private String id_card;
    private Integer area_id;
    private String phone;
    private String remark;

    public Administrator(Integer id, String code, Integer gender, String nation, String education, String description, String status, String name, String id_card, Integer area_id, String phone, String remark) {
        this.id = id;
        this.code = code;
        this.gender = gender;
        this.nation = nation;
        this.education = education;
        this.description = description;
        this.status = status;
        this.name = name;
        this.id_card = id_card;
        this.area_id = area_id;
        this.phone = phone;
        this.remark = remark;
    }

    public Administrator() {
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

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId_card() {
        return id_card;
    }

    public void setId_card(String id_card) {
        this.id_card = id_card;
    }

    public Integer getArea_id() {
        return area_id;
    }

    public void setArea_id(Integer area_id) {
        this.area_id = area_id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
