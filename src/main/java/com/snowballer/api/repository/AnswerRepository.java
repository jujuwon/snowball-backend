package com.snowballer.api.repository;

import com.snowballer.api.domain.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Long> {
    Answer findByIdAndQuestionId(Long id, Long questionId);
}
