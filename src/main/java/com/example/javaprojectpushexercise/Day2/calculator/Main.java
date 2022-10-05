package com.example.javaprojectpushexercise.Day2.calculator;

public class Main {
    public static void main(String[] args) {
        NumberMaker numberMaker = new RandomNumberMaker();
        Calculator randomNumberCalculator = new Calculator(numberMaker);
        randomNumberCalculator.plus(30);

        Calculator byPassNumberCalculator = new Calculator(new ByPassNumberMaker());
        byPassNumberCalculator.plus(50);
    }
}
