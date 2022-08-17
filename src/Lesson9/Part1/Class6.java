package Lesson9.Part1;

public class Class6 {

    //Проверить начинается ли номер документа с последовательности 555.
    public static void startWith555(String documentNumber) {
        System.out.println(documentNumber.startsWith("555") ? "Начинается" : "Не начинается");

        try {
            if (documentNumber.startsWith("555")) {
                System.out.println("Начиается");
            } else {
                throw new Class6Exseption("Нет совпадений", documentNumber);
            }
        } catch (Exception e) {
            System.err.println("Ошибка: " + e);
        }
        System.out.println("----------------------------------------------------------------------");
    }
}
