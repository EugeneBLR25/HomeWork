package Lesson9.Part1;

public class Class3 {

    //Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре.
    public static void showOnlyLetter(String documentNumber) {
        System.out.println(documentNumber.replaceAll("\\d{4}\\b.\\b|-[0-9]{4}-|\\d|-\\d", "/").replaceFirst("/", ""));
        System.out.println("---------------------------------------------------------------------");
    }
}
