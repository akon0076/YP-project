package com.dao.mapper;

import com.entity.dto.Admin.GetStorageDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by RedLee on 2018/11/29.
 * Save表操作接口
 */
@Repository
public interface AdminMapper {

    public List<GetStorageDTO> getStorage(Integer adminId);

}
