package ru.aplana;

import java.util.Scanner;

public class Lesson11 {
    public static void main(String[] args) {
        Scanner sNum1 = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        String stringNum1 = sNum1.nextLine();
        Scanner sNum2 = new Scanner(System.in);
        System.out.print("Введите второе число: ");
        Integer num2 = sNum2.nextInt();
        Integer num1 = Integer.parseInt(stringNum1);
        int comp = num2.compareTo(num1);
        switch (comp) {
            case 1:
                double dNum1 = num1.doubleValue();
                System.out.println(num2 +" больше числа " + dNum1);
                break;
            case -1:
                double dNum2 = num2.doubleValue();
                System.out.println(num1 +" больше числа " + dNum2);
                break;
            default:
                System.out.println("Введеные числа равны");
        }
    }
}
