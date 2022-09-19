package Lesson13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Создать коллекцию класса ArrayList со значениями имен всех студентов в группе.
 * С помощью Stream'ов:
 * - Вернуть количество людей с вашим именем (вне зависимости от верхнего/нижнего
 * регистра букв)
 * - Выбрать все имена, начинающиеся на "а" (вне зависимости от верхнего/нижнего регистра букв)
 * - Отсортировать и вернуть первый элемент коллекции или "Empty", если коллекция пуста
 */
public class Patr2 {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<String>(List.of(
                "Евгений",
                "Иван",
                "евгений",
                "дмитрий",
                "Евгений",
                "Борис",
                "андрей",
                "Антон"));

        // Вернуть количество людей с вашим именем (вне зависимости от верхнего/нижнего регистра букв
        System.out.println(stringArrayList.stream().filter("Евгений"::equalsIgnoreCase).count());

        //Выбрать все имена, начинающиеся на "а" (вне зависимости от верхнего/нижнего регистра букв)
        stringArrayList.stream()
                .filter((str) -> str.charAt(0) == 'а' || str.charAt(0) == 'А')
                .forEach(System.out::println);

        //Отсортировать и вернуть первый элемент коллекции или "Empty", если коллекция пуста
        System.out.println(stringArrayList.stream()
                .sorted()
                .findFirst().orElse("Empty"));
    }
}
