package com.serviceImpl;

import com.dao.mapper.SaveMapper;
import com.entity.Area;
import com.entity.Package;
import com.entity.Sending;
import com.entity.Storage;
import com.service.SaveService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Transactional
@Service
public class SaveServiceImpl implements SaveService {
    private final SaveMapper saveMapper;

    public SaveServiceImpl(SaveMapper saveMapper) {
        this.saveMapper = saveMapper;
    }

    @Override
    public Storage saveStorage(Storage storage) {

        Integer row = this.saveMapper.saveStorage(storage);

        return storage;
    }

    @Override
    public Sending saveSending(Sending sending) {
        Integer row = this.saveMapper.saveSending(sending);
        return sending;
    }

    @Override
    public List<Area> findArea(){
        List<Area> areas = this.saveMapper.findArea();
        return areas;
    }

    @Override
    public List<Package> findPackage(Integer areaId){
        return this.saveMapper.findPackage(areaId);
    }
}
