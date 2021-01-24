package ru.aplana;

public class Lesson3 {
    public static void main(String[] args) {
        int [] Array = {1,2,3,4,5};
        int FirstInt = Array[0];
        Array[0] = Array[(Array.length-1)];
        Array[(Array.length-1)] = FirstInt;
        int sum = Array[0] + Array[(Array.length-3)];
        System.out.println(sum);

    }
}
