package com.myproject.parkinglot.service;

import com.myproject.parkinglot.dto.UserDto;
import com.myproject.parkinglot.model.User;

public interface UserService {
    User createUser(UserDto userDto);
}
