package com.bms.clinicmanagementsystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    @Column(length = 64)
    private String firstName;

    @Column(length = 64)
    private String lastName;

    @OneToMany(mappedBy = "patient")
    private List<PatientCase> patientCases;

    @OneToMany(mappedBy = "patient")
    private List<Document> documents;
}
