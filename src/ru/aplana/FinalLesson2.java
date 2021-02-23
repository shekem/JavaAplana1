package ru.aplana;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FinalLesson2 {
    public static void main(String[] args) {
        boolean positive = false;
        String eq;
        do {
            Scanner sEq = new Scanner(System.in);
            System.out.println("Введите свое уравнение (сложение/вычитание, цифры 0-9, x в качестве неизвестного): ");
            eq = sEq.nextLine();
            Pattern pattern = Pattern.compile("([x0-9]){1}[\\+\\-]([x0-9]){1}\\=([x0-9]){1}");
            Matcher m = pattern.matcher(eq);
            if (m.matches()) {
                positive = true;
            } else {
                System.out.println("ОШИБКА! Уравнение не подходит по параметрам!");
            }
        } while (!positive);
        int operation = eq.indexOf('+');
        int x = eq.indexOf('x');
        String [] num = eq.split("[\\+\\-\\=x]");
        num = Arrays.stream(num).filter(ex -> !ex.isEmpty()).toArray(String[]::new);
        int a = Integer.parseInt(num[0]);
        int b = Integer.parseInt(num[1]);
        switch (x) {
            case 0:
                if (operation == 1) {
                    x = b - a;
                    System.out.println("Ответ: " + x);
                } else {
                    x = b + a;
                    System.out.println("Ответ: " + x);
                }
                break;
            case 2:
                if (operation == 1) {
                    x = b - a;
                    System.out.println("Ответ: " + x);
                } else {
                    x = a - b;
                    System.out.println("Ответ: " + x);
                }
                break;
            default:
                if (operation == 1) {
                    x = a + b;
                    System.out.println("Ответ: " + x);
                } else {
                    x = a - b;
                    System.out.println("Ответ: " + x);
                }
                break;
            }

        }

    }

