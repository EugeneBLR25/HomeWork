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
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int counter = 0;
        for (int i : array) {
            if (i == number) {
                counter++;
            }
        }
        System.out.println(counter > 0 ? "Число " + number + " входит в массив. Количество повторений: " + counter : "Число " + number + " не входит в массив");
        System.out.println("-----------------------------------------------------");
/*
  2. Создайте массив целых чисел. Удалите все вхождения заданного числа из массива. Пусть
  число задается с консоли (класс Scanner). Если такого числа нет выведите сообщение об этом.
 */
        System.out.println("Задача 2");
        int[] array2 = new int[20];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) ((Math.random() * 20) + 10);
        }
        System.out.println("Созданный массив: " + Arrays.toString(array2));
        System.out.print("Введите число: ");
        int number2 = scanner.nextInt();
        int delete = 0;
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] == number2) {
                array2[i] = (int) (Math.random() * 20);
                delete++;
            }
        }
        System.out.println(delete == 0 ? "Заданного числа в массиве не найдено." : "Новый   массив: " + Arrays.toString(array2));

        System.out.println("-----------------------------------------------------");
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
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        double average = 0;
        System.out.println(Arrays.toString(array3));
        System.out.print("Минимальное значение: ");
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < min) {
                min = array3[i];
            }
        }
        System.out.println(min);
        System.out.print("Максимальное значение: ");
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] > max) {
                max = array3[i];
            }
        }
        System.out.println(max);
        System.out.print("Среднее значение: ");
        for (int i = 0; i < array3.length; i++) {
            average += array3[i];
        }
        System.out.println(average / array3.length);
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
        }
        for (int i = 0; i < array5.length; i++) {
            array5[i] = (int) ((Math.random() * 20 + 10));
        }
        double avArray4 = 0;
        double avArray5 = 0;
        for (int i : array4) {
            avArray4 += i;
        }
        for (int i : array5) {
            avArray5 += i;
        }
        double average1 = avArray4 / array4.length;
        double average2 = avArray5 / array5.length;
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

