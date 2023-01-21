package com.tweteroo.api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

public record TweeteDTO(
                @NotBlank @NotEmpty String username,
                @NotBlank @NotEmpty String tweet) {

}
