package com.sevensevengsi.HotelManagementSystem.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Room")
public class Room {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long hotelId;

    private Long CategoryId;

    private Long RoomStatusId;

    private float Price;

    private String Description;
}
