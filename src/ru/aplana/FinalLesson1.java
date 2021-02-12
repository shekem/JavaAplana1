package ru.aplana;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FinalLesson1 {
    public static void main(String[] args) {
        Scanner sExRate = new Scanner(System.in);
        System.out.print("Введите актуальный курс доллара в рублях: ");
        double exRate = sExRate.nextDouble();
        Scanner sRub = new Scanner(System.in);
        System.out.print("Введите количество рублей: ");
        double rub = sRub.nextDouble();
        double dollars = rub / exRate;
        DecimalFormat df = new DecimalFormat("###.##");
        System.out.println("Результат: " + df.format(dollars) + " долларов");
    }
}
