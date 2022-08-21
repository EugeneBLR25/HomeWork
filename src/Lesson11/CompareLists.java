package Lesson11;

import java.io.*;
import java.util.*;

/**
 * Сравните производительность 2 коллекций: ArrayList, LinkedList
 * Программа должна сравнить скорость работы всех основных действий:
 * - Взятие по индексу (из начала, из конца, из середины)
 * - Поиск по элементу
 * - Добавление (в начало, в конец, в середину)
 * - Удаление (в начало, в конец, в середину)
 * Результат запишите в файл result.txt
 * Приложите данный файл в git (в pull request он должен отображаться) + код
 * Каждый из списков должен содержать 10000000 элементов.
 */
public class CompareLists {
    //Создаем две коллекции
    public static List<Integer> arrayList = new ArrayList<>();
    public static List<Integer> linkedList = new LinkedList<>();

    public static void main(String[] args) {

        result(arrayList, linkedList);
    }

    //Метод заполнения коллекций случайными числами и вызов следующего метода
    public static void result(List arrayList, List linkedList) {
        for (int i = 0; i < 10_000_000; i++) {
            arrayList.add((int) (Math.random() * 10));
            linkedList.add((int) (Math.random() * 10));
        }
        writeFile(arrayList, linkedList);
    }

    //Метод создания файла и записи в него данных
    public static void writeFile(List arrayList, List linkedList) {
        File myFile = new File("result.txt");
        try {
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(myFile));
            fileWriter.write(compareArrLinkList(arrayList, (int) (Math.random() * 10)));
            fileWriter.write(compareArrLinkList(linkedList, (int) (Math.random() * 10)));
            fileWriter.close();
        } catch (Exception e) {
            System.err.println("Не получилось записать данные в файл.");
            ;
        }
    }

    //Метод подсчета времени получения элемента
    public static long getElement(List list, int index) {
        long start = System.nanoTime();
        list.get(index);
        return System.nanoTime() - start;
    }

    //Метод подсчета времени поиска элемента
    public static long searchElement(List list, int element) {
        long start = System.nanoTime();
        list.isEmpty();
        return System.nanoTime() - start;
    }

    //Метод подсчета времени добавления элемента
    public static long addElement(List list, int index, Object object) {
        long start = System.nanoTime();
        list.add(index, object);
        return System.nanoTime() - start;
    }

    //Метод подсчета времени удаления элемента
    public static long remoteElement(List list, int index) {
        long start = System.nanoTime();
        list.remove(index);
        return System.nanoTime() - start;
    }

    //Метод получения обобщенных данных по основным функциям коллекции
    public static String compareArrLinkList(List list, Integer integer) {
        return list.getClass() + ":\n" +
                "Получение первого индекса: " + getElement(list, 0) + " напосекунд;\n" +
                "Получение индекса в середине коллекции: " + getElement(list, (list.size() / 2)) + " напосекунд;\n" +
                "Получение индекса в конце коллекции: " + getElement(list, list.size() - 1) + " напосекунд;\n" +
                "Поиск элемента: " + searchElement(list, integer) + " напосекунд;\n" +
                "Добавление элемента в начало: " + addElement(list, 0, integer) + " напосекунд;\n" +
                "Добавление элемента в середину: " + addElement(list, list.size() / 2, integer) + " напосекунд;\n" +
                "Добавление элемента в конец: " + addElement(list, list.size() - 1, integer) + " напосекунд;\n" +
                "Удаление элемента в начале коллекции: " + remoteElement(list, 0) + " напосекунд;\n" +
                "Удаление элемента в середине коллекции: " + remoteElement(list, list.size() / 2) + " напосекунд;\n" +
                "Удаление элемента в конце коллекции: " + remoteElement(list, list.size() - 1) + " напосекунд;\n";
    }
}
