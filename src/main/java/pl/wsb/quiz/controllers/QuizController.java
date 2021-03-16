package pl.wsb.quiz.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.wsb.quiz.model.AbstractQuiz;
import pl.wsb.quiz.model.MultichoiceQuiz;
import pl.wsb.quiz.model.SimpleQuiz;

import java.util.List;
import java.util.Optional;

@RestController
public class QuizController {
    AbstractQuiz quiz;

    @GetMapping("/quiz")
    public String quiz(){
        quiz = MultichoiceQuiz.builder()
                .question("Kiedy powstała Java?")
                .answers(List.of("1998", "2000", "1993", "2005"))
                .validAnswers(List.of("1993"))
                .build();
        return quiz.toString();
    }

    @GetMapping("/quiz/answer")
    public String answerForQuiz(@RequestParam String answer){
        return quiz.isValidAnswer(answer) ? "Ok": "Bad answer";
    }

    @GetMapping("/quiz/json")
    public ResponseEntity<SimpleQuiz> quizJson(){
        return ResponseEntity.of(
                Optional.of(
                        SimpleQuiz.builder()
                            .question("Kiedy powstała Java")
                            .answer1("2000")
                            .answer2("1998")
                            .answer3("1993")
                            .valid(3)
                            .build()));
    }
}
