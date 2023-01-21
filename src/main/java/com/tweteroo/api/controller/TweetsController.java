package com.tweteroo.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo.api.dto.TweeteDTO;
import com.tweteroo.api.model.Tweete;
import com.tweteroo.api.service.TweeteService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/tweets")
public class TweetsController {
    @Autowired
    private TweeteService service;

    @GetMapping
    public List<TweeteDTO> listAll() {
        return service.listAll();
    }

    @PostMapping
    public String createTweet(@RequestBody @Valid TweeteDTO req) {
        service.create(req);
        return "OK";
    }
}
