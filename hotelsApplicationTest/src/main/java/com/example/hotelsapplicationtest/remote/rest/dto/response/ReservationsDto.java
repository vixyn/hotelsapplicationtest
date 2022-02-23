package com.example.hotelsapplicationtest.remote.rest.dto.response;

import java.util.List;

public class ReservationsDto {
    List<ReservationStatusDto> reservations;

    public ReservationsDto() {
    }

    public ReservationsDto(List<ReservationStatusDto> reservations) {
        this.reservations = reservations;
    }

    public List<ReservationStatusDto> getReservations() {
        return reservations;
    }

    public void setReservations(List<ReservationStatusDto> reservations) {
        this.reservations = reservations;
    }
}
