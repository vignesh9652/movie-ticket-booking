package com.movie_ticket_booking.repository;

import com.movie_ticket_booking.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository
        extends JpaRepository<User , Long> {

}
