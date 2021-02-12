package ru.aplana;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson13 {
    public static void main(String[] args) {
        int count = 0;
        Scanner sPhrase = new Scanner(System.in);
        System.out.println("Введите необходимую строку для проверки: ");
        String phrase = sPhrase.nextLine();
        Pattern pattern = Pattern.compile("\\b[A-Za-z]+\\b");
        Matcher m = pattern.matcher(phrase);
        while (m.find()) {
            System.out.println(m.group() + " ");
            count++;
        }
        System.out.println("Слов на латинице (и только на латинице) в строке - " + count);
    }
}
