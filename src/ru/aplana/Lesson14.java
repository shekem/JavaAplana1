package ru.aplana;

import java.util.concurrent.ThreadLocalRandom;

public class Lesson14 {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int [] myArray = new int[15];
        for (int i = 0; i < myArray.length;i++) {
            int num = ThreadLocalRandom.current().nextInt(-20,21);
            myArray[i] = num;
            System.out.print(myArray[i] + " ");
            if (myArray[i] < min){
                min = myArray[i];
            } else if (myArray[i] > max) {
                max = myArray[i];
            }
        }
        System.out.println(); //Переход на новую строку после цикла для более удобного отображения результата
        System.out.println("Максимальное число в массиве: " + max);
        System.out.println("Минимальное число в массиве: " + min);
        int aResult = Math.abs(max) - Math.abs(min);
        if (aResult > 0) {
            System.out.println("Максимальное значение по модулю: " + Math.abs(max));
        } else if (aResult < 0) {
            System.out.println("Максимальное значение по модулю: " + Math.abs(min));
        } else {
            System.out.println("Модули максимального и минимального значения равны");
        }
    }
}
