package ru.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = {1, 2, 3, 4, 5};
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println(ages.length + " " + surnames.length + " " + prices.length);
        String[] names = new String[4];
        names[0] = "Max";
        names[1] = "Ivan";
        names[2] = "Masha";
        names[3] = "Ma";
        System.out.println(names[0] + " " + names[2] + " " + names[3]);

    }
}
