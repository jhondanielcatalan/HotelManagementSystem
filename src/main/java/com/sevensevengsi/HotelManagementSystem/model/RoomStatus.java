package com.sevensevengsi.HotelManagementSystem.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "RoomStatus")
public class RoomStatus {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String description;

}
