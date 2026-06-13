package com.movie_ticket_booking.dto.logindto;

import com.movie_ticket_booking.enums.Roles;
import lombok.Data;

@Data
public class LoginResponseDto {
    private Long id;
    private String userName;
    private String email;
    private Roles role;
}
