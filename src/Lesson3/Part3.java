package Lesson3;

import java.util.Scanner;

/**
 * Дополнительные задания 1,2,3.
 */
public class Part3 {
    public static void main(String[] args) {

        // Задание 1
        System.out.println("Задание 1");
        int count1 = 0;
        int count2 = 1;
        int sum;
        for (int i = 0; i < 10; i++) {
            if (i == 0) {
                System.out.print(count1 + " " + count2 + " ");
                continue;
            }
            sum = count2 + count1;
            System.out.print(sum + " ");
            count1 = count2;
            count2 = sum;
        }

        // Задание 2 Калькулятор вкладов
        System.out.println("");
        System.out.println("");
        System.out.println("Задание 2");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму вклада:");
        double depositSumm = scanner.nextDouble();
        System.out.print("Введите количество месяцев вклада:");
        int depositMonth = scanner.nextInt();
        System.out.print("Сумма вклада по окончанию периода: ");
        for (int i = 0; i < depositMonth; i++) {
            depositSumm = depositSumm * 1.07;
        }
        System.out.println(depositSumm);


        // Задание 3 Таблица умножения
        System.out.println("");
        System.out.println("Задание 3");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "| ");
            for (int j = 1; j <= 10; j++) {
                System.out.print(j * i + " ");
            }
            System.out.println("");
        }
    }
}

