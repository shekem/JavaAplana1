package ru.aplana;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FinalLesson4 {
    public static void main(String[] args) {
        boolean positive = false;
        int count = 3;
        Scanner sHelp = new Scanner(System.in);
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает. Кто он?");
        System.out.println("У вас 3 попытки");
        System.out.println("Можете запросить подсказку, введя слово 'подсказка' в строку.");
        System.out.println("При использовании подсказки у вас только будет только одна попытка");
        String help = sHelp.nextLine();
        if (help.equalsIgnoreCase("подсказка")) {
            Scanner sAnswer = new Scanner(System.in);
            System.out.println("Это вредная компьютерная программа. Каков ваш ответ?");
            String answer = sAnswer.nextLine();
            if (answer.equalsIgnoreCase("заархивированный вирус")) {
                System.out.println("Правильно!");
            } else {
                System.out.println("Обидно, приходи в другой раз");
            }
        } else if (help.equalsIgnoreCase("заархивированный вирус")) {
            System.out.println("Правильно!");
        } else {
            do {
                System.out.println("Подумай еще!");
                count--;
                System.out.println("Осталось " + count + " попытки");
                System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает. Кто он?");
                Scanner sAnswer = new Scanner(System.in);
                String answer = sAnswer.nextLine();
                if (answer.equalsIgnoreCase("заархивированный вирус")) {
                    System.out.println("Правильно!");
                    positive = true;
                } else if (answer.equalsIgnoreCase("подсказка")) {
                    System.out.println("Подсказка уже недоступна");
                } else if (count == 1 && !answer.equalsIgnoreCase("заархивированный вирус")) {
                    positive = true;
                    System.out.println("Попытки кончились!");
                    System.out.println("Обидно, приходи в другой раз");
                }
            } while (!positive);
            System.exit(0);
        }
    }
}



