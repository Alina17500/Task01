package ru.vsu.cs.volobueva;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        checkFirstCase();
        checkSecondCase();
        checkThirdCase();
        checkFourthCase();
    }

    private static int enterIntData() {
        System.out.print("Enter necessary amount: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static String enterStringData() {
        System.out.print("Enter time: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static void checkFirstCase() {
        Time time = new Time(0);
        time.fromStringToNumbers("22-44-45");

        time.addHour(2);
        time.addMinute(5);
        time.addSecond(45);

        System.out.println(time.fromNumbersToString());
    }

    private static void checkSecondCase() {
        Time firstTime = new Time(0);
        firstTime.fromStringToNumbers("9.45.00");

        Time secondTime = new Time(0);
        secondTime.fromStringToNumbers("18.30.00");

        firstTime.findTimeInterval(secondTime, firstTime);

        System.out.println(firstTime.fromNumbersToString());
    }

    private static void checkThirdCase() {
        Time time = new Time(0);
        time.fromStringToNumbers("21:55:55");

        time.takeHour(5);
        time.takeMinute(30);
        time.takeSecond(50);

        System.out.println(time.fromNumbersToString());
    }

    private static void checkFourthCase() {
        Time time = new Time(0);
        time.fromStringToNumbers(enterStringData());

        time.addHour(enterIntData());
        time.addMinute(enterIntData());
        time.addSecond(enterIntData());

        time.takeHour(enterIntData());
        time.takeMinute(enterIntData());
        time.takeSecond(enterIntData());

        System.out.println(time.fromNumbersToString());
    }
}
