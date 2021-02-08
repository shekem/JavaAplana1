package ru.aplana;

import java.util.Scanner;

public class Lesson7 {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = 3;
        Scanner sLength = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int Length = sLength.nextInt();
        int [] myArray = new int[Length];
        for (int i = 0; i <  myArray.length; i++) {
            Scanner sNum = new Scanner(System.in);
            System.out.print("Введите элемент массива: ");
            int Num = sNum.nextInt();
            myArray[i] = Num;
        }
        for (int nums : myArray) {
            if (nums == x || nums == y || nums == z)
                System.out.println("Данное значение имеется в константах");
            break;
        }
    }
}
