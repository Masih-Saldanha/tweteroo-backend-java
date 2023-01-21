package com.tweteroo.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tweteroo.api.model.Tweete;

public interface TweeteRepository extends JpaRepository<Tweete, Long> {
    
}
