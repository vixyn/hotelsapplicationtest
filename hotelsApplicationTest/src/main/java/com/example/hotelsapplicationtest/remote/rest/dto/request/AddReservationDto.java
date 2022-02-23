package com.example.hotelsapplicationtest.remote.rest.dto.request;

import com.example.hotelsapplicationtest.remote.rest.dto.response.RoomDto;

import java.util.List;

public class AddReservationDto {
    private List<RoomDto> roomsReservation;
    private PersonDto person;

    public AddReservationDto() {
    }

    public AddReservationDto(List<RoomDto> roomsReservation, PersonDto person) {
        this.roomsReservation = roomsReservation;
        this.person = person;
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
