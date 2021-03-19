package pl.wsb.quiz.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.wsb.quiz.model.AbstractQuiz;
import pl.wsb.quiz.model.MultichoiceQuiz;
import pl.wsb.quiz.model.OpenQuiz;
import pl.wsb.quiz.model.SimpleQuiz;

import java.util.List;
import java.util.Optional;

@RestController
public class QuizController {
    AbstractQuiz quiz;

    @GetMapping("/quiz/{id}")
    public String quiz(@PathVariable int id) {
        if (id == 1) {
            quiz = MultichoiceQuiz.builder()
                    .question("When was Java born?")
                    .answers(List.of("1998", "2000", "1993", "2005"))
                    .validAnswers(List.of("1993"))
                    .build();
        }
        if (id == 2) {
            quiz = OpenQuiz.builder()
                    .question("Enter the object creation operator")
                    .validAnswer("new")
                    .build();
        }
        return quiz.toString();
    }

    @GetMapping("/quiz/answer")
    public String answerForQuiz(@RequestParam String answer){
        return quiz.isValidAnswer(answer.split(" ")) ? "Ok": "Bad answer";
    }

    @GetMapping("/quiz/json")
    public ResponseEntity<SimpleQuiz> quizJson(){
        return ResponseEntity.of(
                Optional.of(
                        SimpleQuiz.builder()
                            .question("When was Java born?")
                            .answer1("2000")
                            .answer2("1998")
                            .answer3("1993")
                            .valid(3)
                            .build()));
    }
}
