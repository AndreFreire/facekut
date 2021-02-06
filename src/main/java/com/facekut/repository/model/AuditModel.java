package com.facekut.repository.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuditModel {
    @Id
    private String id;
    @LastModifiedDate
    private LocalDate lastModifiedDate;
    @CreatedDate
    private LocalDate createdDate;
}
