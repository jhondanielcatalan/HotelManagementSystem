package com.sevensevengsi.HotelManagementSystem.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "Request")
public class Request {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long RoomId;

    private Long CustomerId;

    private Long RequestStatusId;

    private Date date;

    private float Amount;

    private Date CheckedInDate;

    private Date CheckedOutDate;


}
