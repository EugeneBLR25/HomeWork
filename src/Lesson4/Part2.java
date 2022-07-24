package Lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {
        /*1. Создайте массив из N случайных целых чисел и выведите его на экран. Размер массива пусть
        задается с консоли и размер массива может быть больше 5 и меньше или равно 10. Если N не
        удовлетворяет условиям выведите сообщение. Если пользователь ввел неподходящее N , то
        программа должна просить пользователя повторить ввод. Создайте второй массив только из четных
        элементов первого массива, если они там есть, и вывести его на экран.*/

        System.out.println("Задача 1");
        Scanner scanner = new Scanner(System.in);
        int[] array = null;
        int[] array2;
        int number;
        int counter1 = 0;
        int counter2 = 0;
        System.out.print("Введите число с 6 до 10: ");
        while (scanner.hasNextInt()) {
            number = scanner.nextInt();
            if (number > 5 && number <= 10) {
                array = new int[number];
                for (int i = 0; i < array.length; i++) {
                    array[i] = (int) (Math.random() * 20);
                    if (array[i] % 2 == 0) {
                        counter1++;
                    }
                }
                break;
            } else {
                System.out.print("Введено не корректное число. Повторите попытку\nВведите число с 6 до 10: ");
            }
        }
        array2 = new int[counter1];
        for (int arr : array) {
            if (arr % 2 == 0) {
                array2[counter2] = arr;
                counter2++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));

        System.out.println("-------------------------------------------------------------------------");

        /*2. Создайте массив и заполните его. Выведите массив на экран в строку. Заменить каждый элемент с
        нечетным индексом на 0. Снова выведите массив на экран на отдельной строке.*/

        System.out.println("Задача 2");
        int[] array3 = new int[100];
        for (int i = 0; i < array3.length; i++) {
            array3[i] = (int) (Math.random() * 20);
        }
        System.out.println(Arrays.toString(array3));
        for (int i = 1; i < array3.length; i = i + 2) {
            array3[i] = 0;
        }
        System.out.println(Arrays.toString(array3));

        System.out.println("-------------------------------------------------------------------------");

        /*3. Создайте массив строк. Заполните его произвольными именами людей. Отсортируйте массив.
        Результат выведите на консоль.*/

        System.out.println("Задача 3");
        String[] namesOfPeople = {"Сергей", "Андрей", "Матвей", "Евгений", "Дмитрий", "Иван"};
        Arrays.sort(namesOfPeople);
        System.out.println(Arrays.toString(namesOfPeople));

        System.out.println("-------------------------------------------------------------------------");

        /*4. Реализуйте алгоритм сортировки пузырьком, проставляя комментарии на каждом шаге.*/
        System.out.println("Задача 4");
        int[] array4 = new int[10];                     //Создаем массив;
        for (int i = 0; i < array4.length; i++) {
            array4[i] = (int) (Math.random() * 20);    //Заполняем массив случайными числами;
        }
        System.out.println(Arrays.toString(array4) + " - исходный массив");//Выводим в консоль исходный массив;
        boolean isSort = false; //Создаем и инициализаруем переменную с значеним false управлением циклом;
        int number1;            //Создаем целочисленную переменную для последующего присвоения ей значений из массива;
        while (!isSort) {       //Создаем цикл с условием "пока isSort не равна false";
            isSort = true;      //Присваиваем isSort значение true для остановки цикла если никаких операций в циклк небудет происходить;
            for (int i = 0; i < array4.length - 1; i++) { //В цикле задаем условие i<array4.lenght-1 для предотсращения ошибки программы;
                if (array4[i] > array4[i + 1]) { //Задаем условие "Если в массиве число больше следующего числа" и если оно true тогда выполняется код в условии;
                    number1 = array4[i];       // Переменной number1 присваиваем значение числа с меньшим индексом;
                    array4[i] = array4[i + 1]; //Переприсваиваем значение элементов массива если следующее число больше предыдущего;
                    array4[i + 1] = number1;   //Переприсваиваем значения элементов массива с помощью переменной number1 если следующее число больше предыдущего;
                    isSort = false;            //Присваиваем булевой переменной значение false для очередной итерации цикла;
                }
            }
        }
        System.out.println(Arrays.toString(array4)+" - отсортированый массив"); //Выводим массив в строку после завершения сортировки.
    }
}
