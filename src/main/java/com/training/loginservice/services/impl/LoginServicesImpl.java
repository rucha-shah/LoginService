package com.training.loginservice.services.impl;

import com.training.loginservice.entity.UserEntity;
import com.training.loginservice.repository.LoginRepository;
import com.training.loginservice.services.LoginServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServicesImpl implements LoginServices {

    @Autowired
    LoginRepository loginRepository;

    @Override
    public UserEntity save(UserEntity userEntity)
    {
        return loginRepository.save(userEntity);
    }
}
