package com.facekut.repository.model;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDate;

public class AuditModel {
    @Id
    private String id;
    @LastModifiedDate
    private LocalDate lastModifiedDate;
    @CreatedDate
    private LocalDate createdDate;
}
