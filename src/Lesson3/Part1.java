package Lesson3;

import java.util.Scanner;

/**
 * Домашнее задание часть 1 задачи 1-4.
 */
public class Part1 {
    public static void main(String[] args) {
        // Задание 1
        // Вариант 1, с использованием switch.
        System.out.println("Задача 1");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вариант с использованием Switch.");
        System.out.print("Введите номер месяца:");
        int monthNumber = scanner.nextInt();
        System.out.print("Время года: ");
        switch (monthNumber) {
            case 1 -> System.out.println("Зима");
            case 2 -> System.out.println("Зима");
            case 3 -> System.out.println("Весна");
            case 4 -> System.out.println("Весна");
            case 5 -> System.out.println("Весна");
            case 6 -> System.out.println("Лето");
            case 7 -> System.out.println("Лето");
            case 8 -> System.out.println("Лето");
            case 9 -> System.out.println("Осень");
            case 10 -> System.out.println("Осень");
            case 11 -> System.out.println("Осень");
            case 12 -> System.out.println("Зима");
            default -> System.out.println("Введите корректный номер месяца с 1 до 12");
        }
        // Вариант 2, использование if-else
        System.out.println("Вариант 2 с if-elce");
        System.out.print("Введите номер месяца:");
        int mouthNumber2 = scanner.nextInt();
        System.out.print("Время года: ");
        if (mouthNumber2 == 12 || mouthNumber2 == 1 || mouthNumber2 == 2) {
            System.out.print("Зима");
        } else if (mouthNumber2 == 3 || mouthNumber2 == 4 || mouthNumber2 == 5) {
            System.out.print("Весна");
        } else if (mouthNumber2 == 6 || mouthNumber2 == 7 || mouthNumber2 == 8) {
            System.out.print("Лето");
        } else if (mouthNumber2 == 9 || mouthNumber2 == 10 || mouthNumber2 == 11) {
            System.out.print("Осень");
        }

        // Задача 2
        System.out.println("");
        System.out.println("");
        System.out.println("Задача 2");
        System.out.println("Программа для определения четности чисел.");
        int number;
        int count = 0;
        while (count < 5) {
            System.out.print("Введите число:");
            number = scanner.nextInt();
            if (number % 2 == 0) {
                System.out.println("Число является четным");
            } else {
                System.out.println("Число не четное");
            }
            count++;
        }

        //Задание 3

        System.out.println("");
        System.out.println("Задача 3");
        System.out.print("Введите температуру воздуха: ");
        int t;
        t = scanner.nextInt();
        System.out.print("Состояние погоды: ");
        if (t > 15) {
            System.out.println("Тепло");
        } else if (t <= 15 && t > -5) {
            System.out.println("Нормально");
        } else if (t <= -5) {
            System.out.println("Холодно");
        }

        //Задание 4
        System.out.println("");
        System.out.println("Задача 4");
        System.out.print("Введите цвет радуги: ");
        int color = scanner.nextInt();
        System.out.print("Выбранный цвет: ");
        switch (color) {
            case 1 -> System.out.println("Красный");
            case 2 -> System.out.println("Оранжевый");
            case 3 -> System.out.println("Желтый");
            case 4 -> System.out.println("Зеленый");
            case 5 -> System.out.println("Голубой");
            case 6 -> System.out.println("Синий");
            case 7 -> System.out.println("Фиолетовый");
            default -> System.err.println("Цвет не обнаружен. Введите числа от 1 до 7.");
        }
    }
}

