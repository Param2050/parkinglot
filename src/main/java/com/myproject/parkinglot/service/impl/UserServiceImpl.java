package com.myproject.parkinglot.service.impl;


import com.myproject.parkinglot.dto.UserDto;
import com.myproject.parkinglot.model.User;
import com.myproject.parkinglot.repo.UserRepository;
import com.myproject.parkinglot.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public User createUser(UserDto userDto) {
        User user = new User();
        user.setUserId(UUID.randomUUID());
        user.setUserName(userDto.getUserName());
        user.setEmail(userDto.getEmail());
        user.setMobile(userDto.getMobile());
        user.setAddress(userDto.getAddress());
        user.setRoles(userDto.getRoles());
        return userRepository.save(user);
    }
}
