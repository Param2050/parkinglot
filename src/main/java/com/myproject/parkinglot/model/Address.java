package com.myproject.parkinglot.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Address {
    String streetName;
    String city;
    String state;
    String zipCode;
    String country;
}
