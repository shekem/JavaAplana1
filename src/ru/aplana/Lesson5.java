package ru.aplana;

import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {
        // Получаем числа
        Scanner sa = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = sa.nextInt();
        Scanner sb = new Scanner(System.in);
        System.out.print("Введите второе число: ");
        int b = sb.nextInt();
        //Получаем операцию
        Scanner sOperation = new Scanner(System.in);
        System.out.print("Введите тип операции: ");
        String operation = sOperation.next();
        //Выполняем операцию согласно введенным данным
        int result;
        String resultText;
        switch (operation) {
            case "+":
                result = a + b;
                resultText = (a + " " + "+ " + b + " = " + result);
                break;
            case "-":
                result = a - b;
                resultText = (a + " " + "- " + b + " = " + result);
                break;
            case "*":
                result = a * b;
                resultText = (a + " " + "* " + b + " = " + result);
                break;
            case "/":
                Scanner sroundResult = new Scanner(System.in);
                System.out.print("Округлять результат? (y/n): ");
                String roundResult = sroundResult.next();
                switch (roundResult) {
                    case "y":
                        result = (int) Math.round((double) a / (double) b);
                        resultText = (a + " " + "/ " + b + " = " + result);
                        break;
                    case "n":
                        double resultD = (double) a / (double) b;
                        resultText = (a + " " + "/ " + b + " = " + resultD);
                        break;
                    default:
                        resultText = "Определитесь с округлением для деления!";
                }
                break;
            default:
                resultText = "Определитесь с операцией!";
        }
            System.out.println(resultText);
        }
    }

