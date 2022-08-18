package Lesson9.Part1;

public class Class2 {

    //Вывести на экран номер документа, но блоки из трех букв заменить на *** (каждая буква заменятся на *).
    public static void replaceOnStars(String documentNumber) {
        System.out.println(documentNumber.replaceAll("[a-zA-Z]{3}", "***"));
        System.out.println("---------------------------------------------------------------------");
    }
}
