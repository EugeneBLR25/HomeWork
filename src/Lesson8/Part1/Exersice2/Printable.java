package Lesson8.Part1.Exersice2;

public interface Printable {

    //Задаю статические переменные с названием должностей в организации
    String DIRECTOR = "Директор";
    String WORKER = "Рабочий";
    String BOOKER = "Бухгалтер";

    //Метод для реализации в классах
    void print();
}
