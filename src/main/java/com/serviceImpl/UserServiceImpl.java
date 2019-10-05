package com.serviceImpl;

import com.dao.mapper.UserMapper;
import com.entity.dto.User.LoginDTO;
import com.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
@Service
public class UserServiceImpl implements UserService {
  private final UserMapper userMapper;

  public UserServiceImpl(UserMapper userMapper) {
    this.userMapper = userMapper;
  }

  @Override
  public LoginDTO findUser(String number, String password) {
    return userMapper.findUser(number, password);
  }

  @Override
  public int addUser(String number, String password) {
    return userMapper.addUser(number, password);
  }
}
