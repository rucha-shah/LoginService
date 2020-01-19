package com.training.loginservice.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;

@Getter
@Setter
@Document(collection = "user")

public class UserEntity {
    @Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_generator")

    String userId;
    String userName;
    String email;
    String password;
    String userImageUrl;
    String address;
    long phoneNo;

}
