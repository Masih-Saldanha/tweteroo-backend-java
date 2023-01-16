package com.tweteroo.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo.api.dto.SignUpDTO;

@RestController
@RequestMapping("/sign-up")
public class SignUpController {
    @PostMapping
    public void signUp(@RequestBody SignUpDTO req) {
        System.out.println("ok");
    }
}
