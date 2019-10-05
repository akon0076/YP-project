package com.dao.mapper;

import com.entity.dto.User.LoginDTO;
import com.entity.dto.User.RegisterDTO;
import org.springframework.stereotype.Repository;

/**
 * Created by Song on 2017/2/15.
 * User表操作接口
 */
@Repository
public interface UserMapper{
    //根据名字查找用户
    public LoginDTO findUser(String number , String password);

    //添加用户
    public int addUser(String number, String password);
}
