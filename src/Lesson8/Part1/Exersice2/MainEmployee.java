package Lesson8.Part1.Exersice2;

/**
 * Создать классы "Директор", "Рабочий", "Бухгалтер".
 * Реализовать интерфейс с методом, который печатает название должности и
 * имплементировать этот метод в созданные классы.
 */
public class MainEmployee {
    public static void main(String[] args) {

        //Создаю три сотрудника организации
        Printable director = new Director("Иванов Петр", 50, "Директор");
        Printable worker = new Worker("Сидоров Иван", 20, "Рабочий");
        Printable booker = new Booker("Петрова Лариса", 42, "Бухгалтер");

        //Вызываю методы для вывода информации о должности
        director.print();
        worker.print();
        booker.print();
    }
}
