package com.sevensevengsi.HotelManagementSystem.model;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@EqualsAndHashCode
@Table(name = "Users")
public class User {


    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String username;
    private String password;

    private String fullName;

    private String role;

    private Date dateoFBirth;

    private boolean isEnabled;

    private boolean isAccountNonLocked;

    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", password=" + password + "]";

    }

}

