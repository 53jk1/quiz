package pl.wsb.quiz.exercises.functional;

public class BonusApp {
    public static void main(String[] args) {
        BirthBonus birthBonus = new BirthBonus();
        System.out.println(birthBonus.calculate(100));
        // Anonymous Class
        Bonus anonymousBonus = new Bonus() {
            @Override
            public int calculate(int price) {
                return (price * 90) / 100;
            }
        };

        // A lambda expression to implement the functional interface
        Bonus lambdaBonus = price -> (price * 90) / 100;
        Bonus nextLambda = price -> {
            System.out.println("LAMBDA");
            return (price * 90) / 100;
        };
    }
}
