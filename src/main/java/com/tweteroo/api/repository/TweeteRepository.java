package com.tweteroo.api.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tweteroo.api.model.Tweete;

public interface TweeteRepository extends JpaRepository<Tweete, Long> {
    @Query("FROM Tweete t")
    Page<Tweete> search(Pageable pageable);
}
