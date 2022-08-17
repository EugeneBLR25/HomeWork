package Lesson9.Part1;

public class Class7 {

    //Проверить заканчивается ли номер документа на последовательность 1a2b.
    public static void endWith1a2b(String documentNumber) {

        try {
            if (documentNumber.endsWith("1a2b")) {
                System.out.println("Документ заканчивается на введенные параметры");
            } else {
                throw new Class7Exeption("Документ не заканчивается на введенные параметры", documentNumber);
            }
        } catch (Exception e) {
            System.err.println("Ошибка: " + e);
        }
        System.out.println("----------------------------------------------------------------------");
    }
}
