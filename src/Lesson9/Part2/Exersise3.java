package Lesson9.Part2;

import java.util.Scanner;

public class Exersise3 {

    private String palindromtString;
    StringBuilder stringBuilder;
    private String[] arrayPalindrom;

    public Exersise3(String palindromtString) {
        this.palindromtString = palindromtString;
    }

    public String getPalindromtString() {
        return palindromtString;
    }

    public void setPalindromtString(String palindromtString) {
        this.palindromtString = palindromtString;
    }
    //Обработка исключения
    private void findMistake(String[] array, int numberWord) {
        try {
            if (numberWord < 1 || numberWord > array.length) {
                throw new Exersise3Exeption(numberWord);
            }
        } catch (Exception e) {
            System.err.println(e);
            System.exit(1);
        }
    }
    //Преобразование строки в массив, инициализация сканера, проверка введенного  значения на ошибки
    private String activateScanner() {
        arrayPalindrom = getPalindromtString().replaceAll("[^A-Za-zА-Яа-я0-9]", " ")
                .trim()
                .split(" +");
        System.out.println("Введите номер слова в строке:");
        Scanner sc = new Scanner(System.in);
        int numberWord = sc.nextInt();
        findMistake(arrayPalindrom, numberWord);
        return arrayPalindrom[numberWord - 1];
    }

    //Сравнение выбранного слова с перевернутым словом игнорируя регистр
    public void findPalindrom() {
        String palindromCheck = activateScanner();
        stringBuilder = new StringBuilder(palindromCheck);
        if (palindromCheck.equalsIgnoreCase(String.valueOf(stringBuilder.reverse()))) {
            System.out.println(palindromCheck + " является палиндромом.");
        } else {
            System.out.println("Не является палиндромом.");
        }
    }
}
