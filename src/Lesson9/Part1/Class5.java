package Lesson9.Part1;

public class Class5 {

    /*Проверить содержит ли номер документа последовательность abc и
        вывети сообщение содержит или нет(причем, abc и ABC считается одинаковой последовательностью).*/
    public static void equalsABC(String documentNumber) {
        String[] arrString = documentNumber.split("-");
        boolean isEqual = false;
        for (int i = 0; i < arrString.length; i++) {
            if (arrString[i].equalsIgnoreCase("abc")) {
                isEqual = true;
                break;
            }
        }
        try {
            if(isEqual==false){
                throw new Class5Exeption("Указанный параметр отсутствует в документе",documentNumber);
            }else {
                System.out.println("В документе "+documentNumber+" имеется введенный критерий поиска.");
            }
        } catch (Exception e) {
            System.err.println("Внимение:"+e);
        }
        System.out.println("----------------------------------------------------------------------");
    }
}
