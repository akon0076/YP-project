package com.controller;

import com.entity.JSONResult;
import com.entity.dto.User.LoginDTO;
import com.entity.dto.User.LoginInputDTO;
import com.entity.dto.User.RegisterDTO;
import com.entity.dto.User.RegisterInputDTO;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by Song on 2017/2/15.
 * User控制层
 */
@RestController
@CrossOrigin
@RequestMapping(value = "/user")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public JSONResult show(@Valid LoginInputDTO input){
        JSONResult<LoginDTO> result = new JSONResult<LoginDTO>();
        LoginDTO loginDTO = new LoginDTO();
        LoginDTO findResult = userService.findUser(input.getNumber(), input.getPassword());
        result.setData(findResult);
        return result;
    }

  @RequestMapping(value = "/register",method = RequestMethod.GET)
  public JSONResult register(@Valid RegisterInputDTO input){
    JSONResult<LoginDTO> result = new JSONResult<LoginDTO>();
    LoginDTO findResult = userService.findUser(input.getNumber(), input.getPassword());
    if(findResult == null) {
      userService.addUser(input.getNumber(), input.getPassword());
      findResult = userService.findUser(input.getNumber(), input.getPassword());
    }
    else {
      findResult = null;
    }
    result.setData(findResult);
    return result;
  }
}
