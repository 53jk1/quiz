package pl.wsb.quiz.model;

import lombok.Builder;
import lombok.ToString;

import java.util.Objects;

@ToString
public class OpenQuiz extends AbstractQuiz {

    private String validAnswer;

    @Builder
    public OpenQuiz(String question, String validAnswer) {
        super(question);
        this.validAnswer = validAnswer;
    }

    protected OpenQuiz(String question) {
        super(question);
    }

    @Override
    public boolean isValidAnswer(String ... inputs) {
        if (inputs.length != 1){
            return false;
        }

        return Objects.equals(validAnswer, inputs[0]);
    }
}
