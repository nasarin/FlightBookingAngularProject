package com.nasarin.flightbooking.service;

import com.nasarin.flightbooking.dto.UserRegisterRequestDto;
import com.nasarin.flightbooking.model.User;
import com.nasarin.flightbooking.repository.UserRegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class RegisterService {

    @Autowired
    private UserRegisterRepository userRegisterRepository;

    public  String userRegister(UserRegisterRequestDto userRegisterRequestDto) {

        String resultMsg = "";
        User user = toRegisterEntity(userRegisterRequestDto);

        User savedUser  =  userRegisterRepository.save(user);

        if(Objects.nonNull(savedUser)){
            resultMsg = "Success";
        }else{
            resultMsg = "Failure";
        }

        return resultMsg;
    }

    private User toRegisterEntity(UserRegisterRequestDto userRegisterRequestDto) {
        User user = new User();
        user.setUserName(userRegisterRequestDto.getUserName());
        user.setPassword(userRegisterRequestDto.getPassword());


        return  user;
    }
}
