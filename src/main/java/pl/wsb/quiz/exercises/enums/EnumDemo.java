package pl.wsb.quiz.exercises.enums;

import java.util.Scanner;

public class EnumDemo {
    public static void main(String[] args) {
        Color color = Color.RED;
        switch(color) {
            case RED:
                System.out.println("Red");
                break;
            case BLUE:
                System.out.println("Blue");
                break;
            default:
                System.out.println("Nieznany kolor");
        }
        System.out.println(color.name().toLowerCase());
        System.out.println(color.ordinal());
        System.out.println(Color.RED.getRgb());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz jeden z kolorów:");
        for(Color c: Color.values()){
            System.out.println(c.name());
        }
        String nameColor = scanner.next();
        Color userColor = Color.valueOf(nameColor);
        System.out.println("You choose " + userColor);
    }
}
