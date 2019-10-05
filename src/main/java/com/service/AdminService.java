package com.service;

import com.entity.dto.Admin.GetStorageDTO;

import java.util.List;

/**
 * Created by Song on 2017/2/15.
 * User业务逻辑
 */
public interface AdminService {
    //获取存储信息
    public List<GetStorageDTO> getStorage(Integer adminId);
}
