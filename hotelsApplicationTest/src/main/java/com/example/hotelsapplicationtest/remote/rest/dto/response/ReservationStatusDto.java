package com.example.hotelsapplicationtest.remote.rest.dto.response;

import com.example.hotelsapplicationtest.domain.model.ReservationStatusType;
import com.example.hotelsapplicationtest.remote.rest.dto.request.PersonDto;

import java.util.List;

public class ReservationStatusDto {
    private Integer id;
    private ReservationStatusType status;
    private List<RoomDto> roomsReservation;
    private PersonDto person;

    public ReservationStatusDto() {
    }

    public ReservationStatusDto(Integer id, ReservationStatusType status, List<RoomDto> roomsReservation, PersonDto person) {
        this.id = id;
        this.status = status;
        this.roomsReservation = roomsReservation;
        this.person = person;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ReservationStatusType getStatus() {
        return status;
    }

    public void setStatus(ReservationStatusType status) {
        this.status = status;
    }

    public List<RoomDto> getRoomsReservation() {
        return roomsReservation;
    }

    public void setRoomsReservation(List<RoomDto> roomsReservation) {
        this.roomsReservation = roomsReservation;
    }

    public PersonDto getPerson() {
        return person;
    }

    public void setPerson(PersonDto person) {
        this.person = person;
    }
}
