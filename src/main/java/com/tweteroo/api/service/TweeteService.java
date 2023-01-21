package com.tweteroo.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweteroo.api.dto.TweeteDTO;
import com.tweteroo.api.model.Tweete;
import com.tweteroo.api.repository.TweeteRepository;

@Service
public class TweeteService {
    @Autowired
    private TweeteRepository repository;

    public List<TweeteDTO> listAll() {
        List<Tweete> withId = repository.findAll();
        List<TweeteDTO> withoutId = new ArrayList<>();
        for (Tweete tweet : withId) {
            withoutId.add(tweet.clone());
        }
        return withoutId;
    }

    public void create(TweeteDTO dto) {
        repository.save(new Tweete(dto));
    }
}
