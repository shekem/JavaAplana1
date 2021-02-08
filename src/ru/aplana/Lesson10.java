package ru.aplana;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson10 {
    public static void main(String[] args) {
        int result;
        Scanner sLengthX = new Scanner(System.in);
        System.out.print("Введите длину по горизонтали: ");
        int LengthX = sLengthX.nextInt();
        Scanner sLengthY = new Scanner(System.in);
        System.out.print("Введите длину по вертикали: ");
        int LengthY = sLengthY.nextInt();
        int[][] myArray = new int[LengthX][LengthY];
        for (int i = 0; i < LengthX; i++) {  // идём по строкам
            for (int j = 0; j < LengthY; j++) {  // идём по столбцам
                Scanner sNum = new Scanner(System.in);
                System.out.print("Введите элемент массива: ");
                int Num = sNum.nextInt();
                myArray[i][j] = Num;  // внесение элементов массива в кажду из строк
            }
            System.out.println(); // перенос строки для более удобного ввода в каждую строку массива
        }
        System.out.println("Массив выглядит следующим образом");
        System.out.println(Arrays.deepToString(myArray));
        System.out.println("Результат умножения на 3 первой строки выглядит следующим образом:");
        for (int i = 0; i < LengthX; i++) {
            result = myArray[0][i] * 3;
            System.out.print(" " + result + " ");
        }
    }
}
