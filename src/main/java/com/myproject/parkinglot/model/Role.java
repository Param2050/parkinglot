package com.myproject.parkinglot.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Role {
    @Id
    UUID roleId;
    String name;
}
