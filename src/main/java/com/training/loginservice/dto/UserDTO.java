package com.training.loginservice.dto;

import lombok.Getter;
import lombok.Setter;
import sun.security.util.Password;

@Getter
@Setter

public class UserDTO {

    int userId;
    String userName;
    String email;
    String password;
    String userImageUrl;
    String address;
    int phoneNo;

}
