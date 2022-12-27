package com.sevensevengsi.HotelManagementSystem.model;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "RequestStatus")
public class RequestStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;


}
