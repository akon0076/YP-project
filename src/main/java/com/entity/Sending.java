package com.entity;

import javax.persistence.*;

@Entity
@Table(name = "yp_sending")
public class Sending {
    private Integer id;
    private Integer userId;
    private Integer areaId;
    private Integer sending_addressId;
    private String sendingType;
    private String courierNumber;
    private String addresseeName;
    private String addresseeTel;

    public Sending(Integer id, Integer userId, Integer areaId, Integer sending_addressId, String sendingType, String courierNumber, String addresseeName, String addresseeTel) {
        this.id = id;
        this.userId = userId;
        this.areaId = areaId;
        this.sending_addressId = sending_addressId;
        this.sendingType = sendingType;
        this.courierNumber = courierNumber;
        this.addresseeName = addresseeName;
        this.addresseeTel = addresseeTel;
    }

    public Sending() {
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

    public void setUserId(Integer useId) {
        this.userId = useId;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public Integer getSending_addressId() {
        return sending_addressId;
    }

    public void setSending_addressId(Integer sending_addressId) {
        this.sending_addressId = sending_addressId;
    }

    public String getSendingType() {
        return sendingType;
    }

    public void setSendingType(String sendingType) {
        this.sendingType = sendingType;
    }

    public String getCourierNumber() {
        return courierNumber;
    }

    public void setCourierNumber(String courierNumber) {
        this.courierNumber = courierNumber;
    }

    public String getAddresseeName() {
        return addresseeName;
    }

    public void setAddresseeName(String addresseeName) {
        this.addresseeName = addresseeName;
    }

    public String getAddresseeTel() {
        return addresseeTel;
    }

    public void setAddresseeTel(String addresseeTel) {
        this.addresseeTel = addresseeTel;
    }
}
