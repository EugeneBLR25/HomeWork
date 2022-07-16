package Lesson3;

import java.util.Scanner;

/**
 * Задания 1-6 части 2.
 */
public class Part2 {
    public static void main(String[] args) {

        // Задание 1
        System.out.println("Задание 1");
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0)
                System.out.print(i + " ");
        }

        // Задание 2
        System.out.println("");
        System.out.println("Задание 2");
        for (int i = 15; i > 0; i--) {
            System.out.print(i + " ");
        }

        // Задание 3

        System.out.println("");
        System.out.println("Задание 3");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int N = scanner.nextInt();
        int count = 1;
        int sum = 0;
        if (N > 0) {                                         // Если введено положительное число
            while (count <= N) {
                sum = count + sum;
                count++;
            }
            System.out.println("Сумма чисел от 1 до " + N + ": " + sum);
        } else {                                          // Если введено отрицательное число
            while (count >= N) {
                sum = count + sum;
                count--;
            }
            System.out.println("Сумма чисел от 1 до " + N + ": " + sum);
        }

        // Задание 4
        System.out.println("");
        System.out.println("Задание 4");
        int cutOfSeven = 0;
        while (cutOfSeven >= 0 && cutOfSeven < 100) {
            if (cutOfSeven % 7 == 0)
                System.out.print(cutOfSeven + " ");
            cutOfSeven+=7;
        }

        // Задание 5

        System.out.println("");
        System.out.println("Задание 5");
        int count1 = 0;
        for (int i = 0; i > -100; i = i - 5) {
            count1++;
            System.out.print(count1 + ")" + i + "; ");
            if (count1 == 10) {
                break;
            }
        }

        // Задание 6

        System.out.println("");
        System.out.println("Задание 6");
        int count2 = 0;
        int sqr;
        for (int i = 10; i <= 20; i++) {
            sqr = i*i;
            count2++;
            System.out.print(count2 + ")" + sqr + "; ");
        }
    }
}


