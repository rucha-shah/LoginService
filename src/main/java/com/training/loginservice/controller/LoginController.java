package com.training.loginservice.controller;

import com.training.loginservice.dto.UserDTO;
import com.training.loginservice.entity.UserEntity;
import com.training.loginservice.services.LoginServices;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class LoginController {

    @Autowired
    LoginServices loginServices;

    @PostMapping("/register")
    public ResponseEntity<Integer> register(@RequestBody UserDTO userDTO)
    {
        UserEntity userEntity=new UserEntity();
        BeanUtils.copyProperties(userDTO,userEntity);
        UserEntity userCreated=loginServices.save(userEntity);

        return new ResponseEntity<Integer>(userCreated.getUserId(),HttpStatus.CREATED);
    }
}
