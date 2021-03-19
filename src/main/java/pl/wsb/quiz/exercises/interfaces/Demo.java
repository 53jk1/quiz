package pl.wsb.quiz.exercises.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Swimmingable> swim = new ArrayList<>();
        swim.add(new Pt76());
        swim.add(new Duck());
        List<Movable> move = new ArrayList<>();
        move.add(new Pt76());
        move.add(new Car());
    }
}
