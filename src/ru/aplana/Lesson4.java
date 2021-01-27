package ru.aplana;

import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
        // Получаем числа x, y и z
        Scanner sx = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double x = sx.nextDouble();
        Scanner sy = new Scanner(System.in);
        System.out.print("Введите второе число: ");
        double y = sy.nextDouble();
        Scanner sz = new Scanner(System.in);
        System.out.print("Введите третье число: ");
        double z = sz.nextDouble();

        //Считаем среднее значение
        double mean = (x + y + z) / 3;
        System.out.println(mean);

        //Делим результат на 2 и округляем в меньшую сторону
        int meanCalc = (int)Math.floor(mean / 2);
        System.out.println(meanCalc);

        //Проверяем, что число больше/меньше 3 и выводим соответствующий ответ
        if (meanCalc > 3) {
            System.out.println("Программа выполнена корректно!");
        }
    }
}
