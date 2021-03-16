package pl.wsb.quiz.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SimpleQuiz {
    final String question;
    final String answer1;
    final String answer2;
    final String answer3;
    final String answer4;
    final int valid;
}
