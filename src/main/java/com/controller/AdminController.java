package com.controller;

import com.entity.JSONResult;
import com.entity.dto.Admin.GetStorageDTO;
import com.entity.dto.Admin.GetStorageInputDTO;
import com.entity.dto.User.LoginDTO;
import com.entity.dto.User.LoginInputDTO;
import com.entity.dto.User.RegisterInputDTO;
import com.service.AdminService;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Song on 2017/2/15.
 * Admin控制层
 */
@RestController
@CrossOrigin
@RequestMapping(value = "/admin")
public class AdminController {
    private AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @RequestMapping(value = "/storage",method = RequestMethod.GET)
    public JSONResult show(@Valid GetStorageInputDTO input){
        JSONResult<List<GetStorageDTO>> result = new JSONResult<List<GetStorageDTO>>();
        List<GetStorageDTO> findResult = adminService.getStorage(input.getadminId());
        result.setData(findResult);
        return result;
    }
}
