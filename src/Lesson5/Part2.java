package Lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {
        /*
        1.Умножение двух матриц. Создайте два массива целых чисел размером 3х3 (две матрицы).
        Напишите программу для умножения двух матриц.
        Тестовые данные:
        первый массив {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}}
        второй массив {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}}
        результат: {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}}
        */
        System.out.println("Задача 1");
        int[][] arr = {
                {1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 0, 0}
        };
        int[][] arr2 = {
                {1, 2, 3},
                {1, 1, 1},
                {0, 0, 0},
                {2, 1, 0}
        };
        int[][] array1 = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                for (int k = 0; k < arr[j].length; k++) {
                    array1[i][j] = array1[i][j] + arr[i][k] * arr2[k][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(array1) + " - результат произведения матриц");

        System.out.println("-------------------------------------------------------------------------");
        //2.Создайте двумерный массив целых чисел. Выведите на консоль сумму всех элементов.
        System.out.println("Задача 2");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размеры двухмерного массива: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int sum = 0;
        int[][] array2 = new int[num1][num2];
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = (int) (Math.random() * 10);
                sum += array2[i][j];
            }
        }
        System.out.println(Arrays.deepToString(array2) + " - Исходный массив\n" + sum + " - сумма");

        System.out.println("-------------------------------------------------------------------------");

        //3.Создайте двумерный массив. Выведите на консоль диагонали массива.
        System.out.println("Задача 3");
        int[][] array3 = new int[3][3];
        int secondDiag = array3.length - 1;
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                array3[i][j] = (int) (Math.random() * 10);
                if (i == j)
                    System.out.print(array3[i][j] + " ");
            }
        }
        System.out.println("- главная диагональ");
        for (int i = array3.length - 1; i >= 0; i--) {
            System.out.print(array3[i][secondDiag - i] + " ");
        }
        System.out.println("- побочная диагональ.");
        System.out.println(Arrays.deepToString(array3)+" - исходный массив");
        System.out.println("-------------------------------------------------------------------------");

        //4.Создайте двумерный массив целых чисел. Отсортируйте элементы в строках двумерного массива по возрастанию.
        System.out.println("Задача 4");
        int[][] array4 = new int[2][5];
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4[i].length; j++) {
                array4[i][j] = (int) (Math.random() * 10);
            }
            Arrays.sort(array4[i]);
        }
        System.out.println(Arrays.deepToString(array4) + " - отсортированный массив");
    }
}


