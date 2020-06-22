package com.myproject.parkinglot.dto;

import com.myproject.parkinglot.model.Address;
import com.myproject.parkinglot.model.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    String userName;
    String password;
    String email;
    String mobile;
    Address address;
    List<Role> roles;
}
