package com.dao.mapper;

import com.entity.Area;
import com.entity.Package;
import com.entity.Sending;
import com.entity.Storage;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by RedLee on 2018/11/29.
 * Save表操作接口
 */
@Repository
public interface SaveMapper {

    public Integer saveStorage(Storage storage);

    public Integer saveSending(Sending sending);

    public List<Area> findArea();

    public List<Package> findPackage(Integer areaId);
}
