package com.nasarin.flightbooking.repository;

import com.nasarin.flightbooking.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRegisterRepository extends JpaRepository<User, Integer> {

}
