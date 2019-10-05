package com.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "yp_storage")
public class Storage {
    private Integer id;
    private Integer userId;
    private Integer areaId;
    private Date startTime;
    private Date endingTime;
    private Integer packageId;
    private String storageType;

    public Storage(Integer id, Integer userId, Integer areaId, Date startTime, Date endingTime, Integer packageId, String storageType) {
        this.id = id;
        this.userId = userId;
        this.areaId = areaId;
        this.startTime = startTime;
        this.endingTime = endingTime;
        this.packageId = packageId;
        this.storageType = storageType;
    }

    public Storage() {
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

    public Integer getPackageId() {
        return packageId;
    }

    public void setPackageId(Integer packageId) {
        this.packageId = packageId;
    }

    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }
}
