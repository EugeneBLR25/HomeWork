package Lesson9.Part1;

public class Class4 {

    /*Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре
    (реализовать с помощью класса StringBuilder).*/
    public static void specialFormat(String documentNumber) {
        StringBuilder builder = new StringBuilder(documentNumber);
        builder.replace(0, 5, "Letter:")
                .replace(10, 16, "/")
                .replace(14, 16, "/")
                .setCharAt(16, '/');
        System.out.println(builder);
        System.out.println("---------------------------------------------------------------------");
    }
}
