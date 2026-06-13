package com.movie_ticket_booking.dto.logindto;

import lombok.Data;

@Data
public class LoginRequestDto {
    String email;
    String password;
}
