package com.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "yp_package_history")
public class PackageHistory {
    private Integer id;
    private Integer areaId;
    private Date startTime;
    private Date endingTime;
    private String storageType;
    private Integer sendingAddressId;
    private String sendingType;

    public PackageHistory(Integer id, Integer areaId, Date startTime, Date endingTime, String storageType, Integer sendingAddressId, String sendingType) {
        this.id = id;
        this.areaId = areaId;
        this.startTime = startTime;
        this.endingTime = endingTime;
        this.storageType = storageType;
        this.sendingAddressId = sendingAddressId;
        this.sendingType = sendingType;
    }

    public PackageHistory() {
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndingTime() {
        return endingTime;
    }

    public void setEndingTime(Date endingTime) {
        this.endingTime = endingTime;
    }

    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public Integer getSendingAddressId() {
        return sendingAddressId;
    }

    public void setSendingAddressId(Integer sendingAddressId) {
        this.sendingAddressId = sendingAddressId;
    }

    public String getSendingType() {
        return sendingType;
    }

    public void setSendingType(String sendingType) {
        this.sendingType = sendingType;
    }
}
