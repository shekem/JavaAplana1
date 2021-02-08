package ru.aplana;

import java.util.Scanner;

public class Lesson8 {
    public static void main(String[] args) {
        boolean positive = false;
        int x = 0;
        do {
        Scanner sX = new Scanner(System.in);
        System.out.print("Введите положительное число больше 0: ");
        x = sX.nextInt();
        if (x > 0) {
            positive = true;
        } else {
            System.out.println("ОШИБКА! Повторите");
        }
        } while (!positive);
        int sum = 0;
        for (int num = 1; num <= x; num += 2) {
            sum += num;
        }
        System.out.println(sum);
    }
}
