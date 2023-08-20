package br.com.dio.reactiveflashcards.domain.document.attribute;

import lombok.Builder;

public record Question(String asked, String answered, String expected) {
    @Builder(toBuilder = true)
    public Question{}
}
