package com.controller;

import com.entity.Area;
import com.entity.Package;
import com.entity.Sending;
import com.entity.Storage;
import com.service.SaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * Created by RedLee on 2018/11/29.
 * Save控制层
 */
@RestController
@CrossOrigin
@RequestMapping(value = "/save")
public class SaveController {
    private SaveService saveService;

    @Autowired
    public SaveController(SaveService saveService) {
        this.saveService = saveService;
    }

    @RequestMapping(value = "/saveStorage",method = RequestMethod.POST)
    public Storage saveStorage(@RequestBody Storage storage){
        return this.saveService.saveStorage(storage);
    }

    @RequestMapping(value = "/saveSending",method = RequestMethod.POST)
    public Sending saveSending(@RequestBody Sending sending){
        return this.saveService.saveSending(sending);
    }

    @RequestMapping(value = "/findArea", method = RequestMethod.POST)
    public List<Area> findArea(){
        return this.saveService.findArea();
    }

    @RequestMapping(value = "/findPackage",method = RequestMethod.GET)
    public List<Package> findPackage(@RequestParam Integer areaId){
        return this.saveService.findPackage(areaId);
    }
}
