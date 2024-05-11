package com.retailbusiness.retail.business.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "user")
@Data
public class User {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "firstname")
    private String firstName;
    @Column(name = "middleName")
    private String middleName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "mobileNumber")
    private String mobileNumber;
    @Column(name = "passwordHash")
    private String passwordHash;
    @Column(name = "admin")
    private String admin;
    @Column(name = "vendor")
    private String vendor;
    @Column(name = "registeredAt")
    private String registeredAt;
    @Column(name = "lastLogin")
    private String lastLogin;
    @Column(name = "intro")
    private String intro;
    @Column(name = "profile")
    private String profile;
}
