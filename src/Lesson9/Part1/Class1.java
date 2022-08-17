package Lesson9.Part1;

public class Class1 {

    //Вывести на экран в одну строку два первых блока по 4 цифры.
    public static void twoFirstBlock(String documentNumber) {
        for (int i = 0; i < documentNumber.length(); i++) {
            if ((i >= 0 && i <= 4) || (i >= 9 && i <= 12)) {
                System.out.print(documentNumber.charAt(i));
            }
        }
        System.out.println("\n---------------------------------------------------------------------");
    }
}




