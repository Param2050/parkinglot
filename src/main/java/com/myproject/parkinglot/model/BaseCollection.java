package com.myproject.parkinglot.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.sql.Date;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BaseCollection {

    @CreatedDate
    Date createdDate;

    @LastModifiedDate
    Date lastModifiedDate;

}
