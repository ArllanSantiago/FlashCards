package br.com.dio.reactiveflashcards.domain.repository;

import br.com.dio.reactiveflashcards.domain.document.StudyDocument;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface StudyRepoository extends ReactiveMongoRepository<StudyDocument, String> {
}
