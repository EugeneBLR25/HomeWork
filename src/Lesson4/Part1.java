package Lesson4;


import java.util.Arrays;
import java.util.Scanner;

public class Part1 {
    public static void main(String[] args) {
/*
  1.Создайте массив целых чисел. Напишите программу, которая выводит сообщение о том,
  входит ли заданное число в массив или нет. Пусть число для поиска задается с консоли
  (класс Scanner).
 */
        System.out.println("Задача 1");
        int[] array = new int[]{1, 1, 12, 13, 12, 22, 32, 22, 43, 23, 53, 5, 2, 2, 2, 65};
        Arrays.sort(array);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        System.out.println(Arrays.binarySearch(array, number) >= 0 ? "Число " + number + " входит в массив" : "Число " + number + " не входит в массив");
        System.out.println("-----------------------------------------------------");
/*
  2. Создайте массив целых чисел. Удалите все вхождения заданного числа из массива. Пусть
  число задается с консоли (класс Scanner). Если такого числа нет выведите сообщение об этом.
 */
        System.out.println("Задача 2");
        int[] array2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 10, 1};
        System.out.println("Созданный массив: " + Arrays.toString(array2));
        System.out.print("Введите число: ");
        int number2 = scanner.nextInt();
        int counter = 0;
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] == number2) {
                counter++;
            }
        }
        int[] array2_1 = new int[array2.length - counter];
        int index = 0;
        for (int i = index; i < array2.length; i++) {
            if (number2 != array2[i]) {
                array2_1[index++] = array2[i];
            }
        }
        System.out.println("Отредактированный массив: " + Arrays.toString(array2_1));
        System.out.println("------------------------------------------------------");
/*
  3. Создайте и заполните массив случайными числами и выведите минимальное,
  максимальное и среднее значение. Для генерации случайного числа используйте метод
  Math.random(). Пусть будет возможность создавать массив произвольного размера. Пусть
  размер массива вводится с консоли.
 */
        System.out.println("Зачада 3");
        System.out.print("Укажите размер массива: ");
        int num = scanner.nextInt();
        int[] array3 = new int[num];
        for (int i = 0; i < array3.length; i++) {
            array3[i] = (int) ((Math.random() * 20) + 10);
        }
        double total = 0;
        System.out.println(Arrays.toString(array3));
        Arrays.sort(array3);
        for (int i = 0; i < array3.length; i++) {
            total += array3[i];
        }
        System.out.println("Минимальное значение: "+array3[0]);
        System.out.println("Максимальное значение: "+array3[num-1]);
        System.out.println("Среднне значение: "+total / array3.length);
        System.out.println("-----------------------------------------------------------");

/*
  4. Создайте 2 массива из 5 чисел. Выведите массивы на консоль в двух отдельных строках.
  Посчитайте среднее арифметическое элементов каждого массива и сообщите, для какого
  из массивов это значение оказалось больше (либо сообщите, что их средние
  арифметические равны).
 */
        System.out.println("Задача 4");
        int[] array4 = new int[5];
        int[] array5 = new int[5];
        for (int i = 0; i < array4.length; i++) {
            array4[i] = (int) ((Math.random() * 20 + 10));
            array5[i] = (int) ((Math.random() * 20 + 10));
        }
        double sumArray4 = 0;
        double sumArray5 = 0;
        for (int i=0; i<array4.length; i++) {
            sumArray4 += array4[i];
            sumArray5 += array5[i];
        }
        double average1 = sumArray4 / array4.length;
        double average2 = sumArray5 / array5.length;
        System.out.println("1-й массив: " + Arrays.toString(array4) + " - " + average1 +
                "\n" + "2-й массив: " + Arrays.toString(array5) + " - " + average2);
        if (average1 > average2) {
            System.out.println("Среднее арифметическое 1-го массива больше 2-го массива");
        } else if (average1 < average2) {
            System.out.println("Среднее арифметическое 2-го массива больше 1-го массива");
        } else {
            System.out.println("Среднее арифметическое двух массивов равны.");
        }
    }
}


