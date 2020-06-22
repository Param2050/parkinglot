package com.myproject.parkinglot.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BaseCollection implements Serializable {

    private static final long serialVersionUID = 1L;

    @CreatedDate
    LocalDateTime createdDate;

    @LastModifiedDate
    LocalDateTime lastModifiedDate;

    @Version
    Long version;

}
