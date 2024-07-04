package ru.array;

public class Square {
    public static int[] calculate(int bound) {
        int[] ints = new int[bound];
        for (int i = 0; i  < bound; i++) {
            ints[i] = i * i;
        }
        return ints;
    }

    public static void main(String[] args) {
        int[] array = calculate(5);
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
