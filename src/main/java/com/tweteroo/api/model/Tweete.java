package com.tweteroo.api.model;

import com.tweteroo.api.dto.TweeteDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Tweete {
    public Tweete(TweeteDTO data) {
        this.username = data.username();
        this.tweet = data.tweet();
    }

    public TweeteDTO clone() {
        return new TweeteDTO(username, tweet);
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String username;

    private String avatar;

    @Column(nullable = false)
    private String tweet;
}
