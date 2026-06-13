package com.movie_ticket_booking.service;

import com.movie_ticket_booking.dto.logindto.LoginRequestDto;
import com.movie_ticket_booking.dto.logindto.LoginResponseDto;
import com.movie_ticket_booking.dto.registerdto.RegisterRequestDto;
import com.movie_ticket_booking.dto.registerdto.RegisterResponseDto;
import com.movie_ticket_booking.entity.User;
import com.movie_ticket_booking.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

//Register User
    public RegisterResponseDto registerUser(RegisterRequestDto dto){
      User user = new User();
      user.setUserName(dto.getUserName());
      user.setEmail(dto.getEmail());
      user.setPassword(dto.getPassword());
      user.setRole(dto.getRole());

     User savedUser = userRepository.save(user);

     RegisterResponseDto registerResponseDto = new RegisterResponseDto();
     registerResponseDto.setId(savedUser.getId());
     registerResponseDto.setUserName(savedUser.getUserName());
     registerResponseDto.setEmail(savedUser.getEmail());
     registerResponseDto.setRole(savedUser.getRole());
      return registerResponseDto;
    }

    //Login User


}
