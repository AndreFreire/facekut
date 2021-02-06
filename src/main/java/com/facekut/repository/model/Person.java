package com.facekut.repository.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Person extends AuditModel {
    private String fullName;
    private String nickname;
    private LocalDate birthday;
    private Boolean privateProfile;
}
