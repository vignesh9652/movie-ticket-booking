package com.movie_ticket_booking.dto.registerdto;

import com.movie_ticket_booking.enums.Roles;
import lombok.Data;

@Data
public class RegisterResponseDto {
    private Long id;
    private  String userName;
    private String email;
    private Roles role;
}
