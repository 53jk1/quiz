package pl.wsb.quiz.exercises.functional;

public class BirthBonus implements Bonus {

    @Override
    public int calculate(int price) {
        return (price * 90) / 100;
    }
}
