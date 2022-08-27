package Lesson13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.System.*;

/***
 * Создать коллекцию класса ArrayList наполнить ее элементами рандомными элементами типа
 * Integer.
 * С помощью Stream'ов:
 * - Удалить дубликаты
 * - Вывести все четные элементы в диапазоне от 7 до 17 (включительно)
 * - Каждый элемент умножить на 2
 * - Отсортировать и вывести на экран первых 4 элемента
 * - Вывести количество элементов в стриме
 * - Вывести среднее арифметическое всех чисел в стриме.
 */
public class Part1 {

    private static ArrayList<Integer> integerList;

    public static void main(String[] args) {
        fullList();


        ArrayList<Integer> integers1 = (ArrayList<Integer>) integerList.stream()
                .distinct()                                 //Удаление дубликатов
                .peek(s -> {                                //Вывод четных чисел с 7 до 17
                    if (s >= 7 && s <= 17 && s % 2 == 0) {
                        System.out.print(s + " ");
                    }
                })
                .map(s -> s * 2)                            //Умножение на 2 каждого улемента
                .collect(Collectors.toList());

        out.println("\n--------------------------------------------------------------------------");

        integers1.stream()
                .sorted()                                   //Сортировка коллекции
                .limit(4)
                .forEach(out::println);                     //Вывод первых 4-х элементов

        out.println("\n--------------------------------------------------------------------------");

        long sizeCollection = integers1.stream().count();   //Количество элементов в коллекции
        out.println("\nКоличество элементов: " + sizeCollection);

        out.println("\n--------------------------------------------------------------------------");

        //Подсчет среднего количества значений в коллекции
        out.println(integerList.stream()
                .mapToInt((s) -> Integer.parseInt(String.valueOf(s)))
                .average());
    }

    //Заполнение коллекции
    public static void fullList() {
        integerList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            int randomNumber = (int) (Math.random() * 50);
            integerList.add(randomNumber);
        }
    }
}
