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
public class Employee {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    @Column(length = 64)
    private String firstName;

    @Column(length = 64)
    private String lastName;

    @Column(length = 64)
    private String username;

    @Column(length = 64)
    private String password;

    private String email;

    @Column(length = 64)
    private String phone;

    private Boolean isActive;

    @OneToMany(mappedBy = "employee")
    private List<HasRole> hasRoles;

    @OneToMany(mappedBy = "employee")
    private List<InDepartment> inDepartments;
}
