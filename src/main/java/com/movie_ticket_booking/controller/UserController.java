package com.movie_ticket_booking.controller;

import com.movie_ticket_booking.dto.registerdto.RegisterRequestDto;
import com.movie_ticket_booking.dto.registerdto.RegisterResponseDto;
import com.movie_ticket_booking.entity.User;
import com.movie_ticket_booking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public RegisterResponseDto registerUser(@RequestBody RegisterRequestDto dto){
        return userService.registerUser(dto);
    }
}
