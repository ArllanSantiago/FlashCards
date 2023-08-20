package br.com.dio.reactiveflashcards.api.controller.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

public record UserResponse(
        @JsonProperty("Id")
        String id,
        @JsonProperty("name")
        String name,
        @JsonProperty("email")
        String email
) {
    @Builder(toBuilder = true)
    public UserResponse{}
}
