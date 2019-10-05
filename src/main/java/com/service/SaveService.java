package com.service;

import com.entity.Area;
import com.entity.Package;
import com.entity.Sending;
import com.entity.Storage;

import java.util.List;

/**
 * Created by RedLee on 2018/11/29.
 * Save业务逻辑
 */
public interface SaveService {

    public Storage saveStorage(Storage storage);

    public Sending saveSending(Sending sending);

    public List<Area> findArea();

    public List<Package> findPackage(Integer areaId);
}
