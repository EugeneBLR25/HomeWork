package Lesson11;

import java.util.Arrays;
import java.util.Objects;

/**
 * Представим, что в Java нет коллекции типа ArrayList.
 * Создать свой класс, симулирующий работу класса динамической коллекции - т.е. создать свою
 * кастомную коллекцию.
 * В основе коллекции будет массив.
 * Кастомная коллекция должна хранить элементы разных классов(т.е. это generic).
 * Предусмотреть операции добавления элемента, удаления элемента, получение элемента по
 * индексу, проверка есть ли элемент в коллекции, метод очистки все коллекции.
 * Предусмотреть конструктор без параметров - создает массив размером по умолчанию.+
 * Предусмотреть конструктор с задаваемым размером внутреннего массива.+
 * Предусмотреть возможность автоматического расширения коллекции при добавлении элемента
 * в том случае, когда коллекция уже заполнена.
 */
public class MyArrayList<T> {
    private static int SIZE = 10;
    private Object[] myArray;
    private int pointer;

    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        Integer[] integers = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};
        myArrayList.addAll(integers);
        System.out.println(myArrayList.toString());
        myArrayList.addElement(18);
        myArrayList.addElement(19);
        myArrayList.addElement(20);
        System.out.println(myArrayList.toString());
        myArrayList.remoteElement(10);
        myArrayList.remoteElement(15);
        System.out.println(myArrayList.toString());
        myArrayList.addElement(44);
        System.out.println(myArrayList.toString());
        System.out.println(myArrayList.getElement(6));
        System.out.println(myArrayList.isElement(19));
        System.out.println(myArrayList.isElement(30));
        System.out.println(myArrayList.size());
        myArrayList.clearCollection();
        System.out.println(myArrayList.toString());
    }

    //Конструктор без параметров
    public MyArrayList() {
        myArray = new Object[SIZE];
    }

    //Конструктор с параметрами
    public MyArrayList(int capasity) {
        myArray = new Object[capasity];
    }


    //Добавление элемента
    public void addElement(T item) {
        if (pointer == myArray.length - 1) {
            increaseSizeArray(pointer * 2);
        }
        myArray[pointer++] = item;
    }

    //Добавление массива элементов
    public void addAll(T[] item) {
        for (int i = 0; i < item.length; i++) {
            if (pointer == myArray.length - 1) {
                increaseSizeArray(pointer * 2);
            }
            myArray[pointer++] = item[i];
        }
    }

    //Удаление элемента
    public void remoteElement(T item) {
        if (pointer == 0) {
            return;
        }
        int counter = 0;
        for (int i = 0; i < pointer; i++) {
            if (myArray[i].equals(item)) {
                counter++;
            }
        }
        Object[] newArray = new Object[pointer - counter];
        int index = 0;
        for (int i = index; i < pointer; i++) {
            if (!(item.equals(myArray[i]))) {
                newArray[index++] = myArray[i];
            }
        }
        myArray = newArray;
        pointer = newArray.length - 1;
    }

    //Получение элемента по индексу
    public Object getElement(int index) {
        return myArray[index];
    }

    //Проверка есть ли элемент в коллекции
    public boolean isElement(T item) {
        boolean isTrue = false;
        for (Object type : myArray) {
            if (item.equals(type)) {
                isTrue = true;
            }
        }
        return isTrue;
    }

    //Очистка коллекции
    public void clearCollection() {
        for (int i = 0; i < pointer; i++) {
            myArray[i] = null;
        }
        Object[] newArray = new Object[SIZE];
        System.arraycopy(myArray, 0, newArray, 0, SIZE);
        myArray = newArray;
        pointer = 0;
    }

    //Получение размера коллекции
    public int size() {
        return pointer;
    }

    //Увеличение массива
    public void increaseSizeArray(int newCapasity) {
        Object[] newArray = new Object[newCapasity];
        System.arraycopy(myArray, 0, newArray, 0, pointer);
        myArray = newArray;
    }

    @Override
    public String toString() {
        return "MyArrayList{" + Arrays.toString(myArray) + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyArrayList<?> that = (MyArrayList<?>) o;
        return pointer == that.pointer && Arrays.equals(myArray, that.myArray);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(pointer);
        result = 31 * result + Arrays.hashCode(myArray);
        return result;
    }
}
