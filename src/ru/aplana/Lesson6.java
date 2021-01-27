package ru.aplana;

import java.util.Scanner;

public class Lesson6 {
    public static void main(String[] args) {
        // Узнаем масса или расстояние
        Scanner sThing = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int thing = sThing.nextInt();
        //Считаем массу
        if (thing == 1){
            //Получаем соотношение всех единиц измерения по отношении к "эталону" - килограмму
            float stoneToKg = 6.35029f;
            float poundToKg = 0.453592f;
            float ounceToKg = 0.0283495f;
            //Получаем нужную единицу измерения
            Scanner sMass = new Scanner(System.in);
            System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - стоун, 3 - фунт, 4 - унция");
            int mass = sMass.nextInt();
            Scanner sMassNumber = new Scanner(System.in);
            //Получаем количество единиц
            System.out.print("Введите количество единиц: ");
            float massNumber = sMassNumber.nextFloat();
            float resultKg = 0f;
            float resultStone = 0f;
            float resultPound = 0f;
            float resultOunce = 0f;
            //Считаем и выводим результат
                switch (mass){
                    case 1:
                        resultKg = massNumber;
                        resultStone = massNumber / stoneToKg;
                        resultPound = massNumber / poundToKg;
                        resultOunce = massNumber / ounceToKg;
                        break;
                    case 2:
                        resultKg = massNumber * stoneToKg;
                        resultStone = massNumber;
                        resultPound = resultKg / poundToKg;
                        resultOunce = resultKg / ounceToKg;
                        break;
                    case 3:
                        resultKg = massNumber * poundToKg;
                        resultStone = resultKg / stoneToKg;
                        resultPound = massNumber;
                        resultOunce = resultKg / ounceToKg;
                        break;
                    case 4:
                        resultKg = massNumber * ounceToKg;
                        resultStone = resultKg / stoneToKg;
                        resultPound = resultKg / poundToKg;
                        resultOunce = massNumber;
                        break;
                    default:
                        System.out.println("Вы не выбрали единицу измерения!");
                }
            System.out.println("Результат");
            System.out.println("Килограммы: " + resultKg);
            System.out.println("Стоуны: " + resultStone);
            System.out.println("Фунты: " + resultPound);
            System.out.println("Унции: " + resultOunce);
        }

        else if (thing == 2){
            //Получаем соотношение всех единиц измерения по отношении к "эталону" - метру
            float mileToKg = 1609.34f;
            float yardToKg = 0.9144f;
            float footToKg = 0.3048f;
            //Получаем нужную единицу измерения
            Scanner sLenght = new Scanner(System.in);
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            int lenght = sLenght.nextInt();
            Scanner sLenghtNumber = new Scanner(System.in);
            //Получаем количество единиц
            System.out.print("Введите количество единиц: ");
            float lenghtNumber = sLenghtNumber.nextFloat();
            float resultM = 0f;
            float resultMile = 0f;
            float resultYard = 0f;
            float resultFoot = 0f;
            //Считаем и выводим результат
            switch (lenght) {
                case 1:
                    resultM = lenghtNumber;
                    resultMile = lenghtNumber / mileToKg;
                    resultYard = lenghtNumber / yardToKg;
                    resultFoot = lenghtNumber / footToKg;
                    break;
                case 2:
                    resultM = lenghtNumber * mileToKg;
                    resultMile = lenghtNumber;
                    resultYard = resultM / yardToKg;
                    resultFoot = resultM / footToKg;
                    break;
                case 3:
                    resultM = lenghtNumber * yardToKg;
                    resultMile = resultM / mileToKg;
                    resultYard = lenghtNumber;
                    resultFoot = resultM / footToKg;
                    break;
                case 4:
                    resultM = lenghtNumber * footToKg;
                    resultMile = resultM / mileToKg;
                    resultYard = resultM / yardToKg;
                    resultFoot = lenghtNumber;
                    break;
                default:
                    System.out.println("Вы не выбрали единицу измерения!");
            }
            System.out.println("Результат");
            System.out.println("Метры: " + resultM);
            System.out.println("Мили: " + resultMile);
            System.out.println("Ярды: " + resultYard);
            System.out.println("Футы: " + resultFoot);

        }
    }
}
