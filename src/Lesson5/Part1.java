package Lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Part1 {
    public static void main(String[] args) {
        /* 1. Создайте трехмерный массив из целых чисел. С помощью циклов «пройти» по всему массиву и
         увеличить каждый элемент на заданное число. Пусть число, на которое будет увеличиваться
         каждый элемент, задается из консоли..
         */
        System.out.println("Задача 1");
        int[][][] arrayTwoD = {{{1, 2, 3}, {4, 5, 6}}, {{7, 8, 9}, {10, 11, 12}}, {{13, 14, 15}, {16, 17, 18}}};
        System.out.println(Arrays.deepToString(arrayTwoD) + " - Исходный массив.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        for (int i = 0; i < arrayTwoD.length; i++) {
            for (int j = 0; j < arrayTwoD[i].length; j++) {
                for (int k = 0; k < arrayTwoD[i][j].length; k++) {
                    arrayTwoD[i][j][k] += number;
                }
            }
        }
        System.out.println(Arrays.deepToString(arrayTwoD) + " - конечный массив.");
        System.out.println("--------------------------------------------------------------------------");

        /*Задача 2. Шахматная доска. Создайте программу для раскраски шахматной доски с помощью цикла.
         Использовать двумерный массив String размером 8х8. С помощью циклов задать элементам значения B (Black)
         или W (White).
         */
        System.out.println("Задача 2");
        String[][] arrayChessBox = new String[8][8];
        for (int i = 0; i < arrayChessBox.length; i++) {
            for (int j = 0; j < arrayChessBox[i].length; j++) {
                arrayChessBox[i][j] = (i % 2 == 0 && j % 2 == 0) || (i % 2 != 0 && j % 2 != 0) ? "W" : "B";
                System.out.print(arrayChessBox[i][j] + " ");
            }
            System.out.println("");
        }
    }
}

