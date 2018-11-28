package com.dabao.services;

import com.dabao.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    List<User> findAll();
}
