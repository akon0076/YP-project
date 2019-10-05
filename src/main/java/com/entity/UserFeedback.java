package com.entity;

import javax.persistence.*;
@Entity
@Table(name = "yp_user_feedback")
public class UserFeedback {
    private Integer id;
    private Integer areaId;
    private String content;
    private Integer userId;
    private Integer storageId;
    private Integer sendingId;

    public UserFeedback(Integer id, Integer areaId, String content, Integer userId, Integer storageId, Integer sendingId) {
        this.id = id;
        this.areaId = areaId;
        this.content = content;
        this.userId = userId;
        this.storageId = storageId;
        this.sendingId = sendingId;
    }

    public UserFeedback() {
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getStorageId() {
        return storageId;
    }

    public void setStorageId(Integer storageId) {
        this.storageId = storageId;
    }

    public Integer getSendingId() {
        return sendingId;
    }

    public void setSendingId(Integer sendingId) {
        this.sendingId = sendingId;
    }
}
