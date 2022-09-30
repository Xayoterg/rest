package com.example.rest.controller;

import com.example.rest.entity.UserEntity;
import com.example.rest.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.SecurityContextProvider;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")   //путь
public class UserController {
    @Autowired
    private UserRepo userRepo;

    @GetMapping("/")         //задать маршрут
    public ResponseEntity getUser() {
        return ResponseEntity.ok("Вася");
    }


    @PostMapping
    public String registration(@ModelAttribute UserEntity user) {

        if (userRepo.findByLogin(user.getLogin()) != null) {
            return "пользыватель уже существует";
        } else {
            userRepo.save(user);
            return "Пользователь сохранён";
        }

    }
}



