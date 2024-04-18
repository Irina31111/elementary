package ru.calculator;

public class Calculator {

    public static int plus(int first, int second) {
        int result = first + second;
        return result;
    }

    public static void main(String[] args) {
        int res = plus(100, 500);
        System.out.println(res);
    }

}

