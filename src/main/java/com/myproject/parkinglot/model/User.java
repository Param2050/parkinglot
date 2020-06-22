package com.myproject.parkinglot.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.UUID;

@Data
@Document
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User extends BaseCollection{
    @Id
    UUID userId;
    String userName;
    String password;
    String email;
    String mobile;
    Address address;
    List<Role> roles;
}
