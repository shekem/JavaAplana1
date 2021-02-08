package ru.aplana;

import java.util.Scanner;

public class Lesson9 {
    public static void main(String[] args) {
        double sum = 0; //сумма
        double mean; //среднее арифметическое
        Scanner sLength = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int Length = sLength.nextInt();
        double [] myArray = new double[Length];
        for (int i = 0; i <  myArray.length; i++) {
            Scanner sNum = new Scanner(System.in);
            System.out.print("Введите элемент массива: ");
            double Num = sNum.nextDouble();
            myArray[i] = Num;
        }
        for (double num : myArray) {
            sum += num;
        }
        mean = sum / myArray.length;
        for (double num : myArray) {
            System.out.println("Результат умножения элемента " + num + " на среднее арифметическое " + mean + " равно " + num * mean);
        }
    }
}
