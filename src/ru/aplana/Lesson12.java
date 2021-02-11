package ru.aplana;

import java.util.Scanner;

public class Lesson12 {
    public static void main(String[] args) {
        Scanner sPhrase = new Scanner(System.in);
        System.out.print("Введите необходимую строку для проверки: ");
        String phrase = sPhrase.nextLine();
        boolean cont = phrase.contains("Java");
        boolean start = phrase.startsWith("I like");
        boolean ends = phrase.endsWith("!!!");
        if (cont) {
            System.out.println("Строка строка содержит слово \"Java\"");
        } else
            System.out.println("Строка не содержит требуемое слово");
        if (start) {
            System.out.println("Строка начинается со слов \"I like\"");
        } else
            System.out.println("Строка начинается иначе");
        if (ends) {
            System.out.println("Строка заканчивается символами \"!!!\"");
        } else
            System.out.println("Строка заканчивается иначе");
        if (cont && ends && start) {
            System.out.println(phrase.toUpperCase());
        } else
            System.out.println("Во фразе ошибка, значит - никакого КАПСа");
        String nextPhrase = phrase.replaceAll("a", "o");
        System.out.print(nextPhrase);
    }
}

