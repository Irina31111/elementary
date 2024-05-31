package ru.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int total = 0;
        for (int i = start; i <= finish; i++) {
            total = total + i;
        }
        return total;
    }

    public static int sumByEven(int start, int finish) {
        int total = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0)
                total = total + i;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));

        System.out.println(sumByEven(0, 10));
        System.out.println(sumByEven(3, 8));
        System.out.println(sumByEven(1, 3));

    }
}