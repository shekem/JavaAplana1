package ru.aplana;

import java.util.*;

public class FinalLesson3 {
    public static void main(String[] args) {
        Scanner sNumberOfStrings = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int numberOfStrings = sNumberOfStrings.nextInt();
        String[] stringArray = new String[numberOfStrings];
        Integer [] numbersArray = new Integer [numberOfStrings];
        for (int i = 0; i < stringArray.length; i++) {
            Scanner sNextString = new Scanner(System.in);
            System.out.print("Введите значение новой строки: ");
            String nextString = sNextString.nextLine();
            stringArray[i] = nextString;
            Set<Character> set = new HashSet<Character>();
            for (int m = 0; m < stringArray[i].length(); ++m) {
                set.add(stringArray[i].charAt(m));
            }
            numbersArray[i] = set.size();
        }

        List< Integer > numberList = Arrays.asList(numbersArray);
        int index = numberList.indexOf(Collections.max(numberList));
        System.out.println("Строка с самым большим разнообразием символов: " + stringArray[index]);

    }
}