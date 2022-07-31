package Lesson6.Part2;

/**
 * Создать класс для описания компьютера, в этом классе должны быть поля: стоимость, модель(строковый тип),
 * RAM и HDD. Для полей RAM и HDD следует создать свои собственные классы. Классы для RAM и HDD должны иметь
 * конструктор по умолчанию и конструктор со всеми параметрами.
 * Класс RAM имеет поля "название" и "объем".
 * Класс HDD имеет поля "название", "объем" и "тип" (внешний или внутренний).
 * Класс Computer должен иметь два конструктора:
 * первый с параметрами стоимость и модель,
 * второй со всеми полями.
 * При создании объекта "компьютер" с помощью первого конструктора должны создаваться поля RAM и HDD с помощью
 * конструкторов по умолчанию. В каждом из классов предусмотреть методы для вывода полной информации
 * (вывод всех полей и всех значений).
 * Тестовый сценарий для проверки:
 * создать объект "компьютер 1" с помощью первого конструктора и вывести информацию на экран;
 * создать объект "компьютер 2" с помощью второго конструктора и вывести информацию на экран.
 */
public class Computer {
    double price;
    String modelOfComputer;
    RAM ram;
    HDD hdd;

    public Computer(double price, String modelOfComputer) {
        this.price = price;
        this.modelOfComputer = modelOfComputer;
        ram = new RAM();
        hdd = new HDD();
    }

    public Computer(double price, String modelOfComputer, RAM ram, HDD hdd) {
        this.price = price;
        this.modelOfComputer = modelOfComputer;
        this.ram = ram;
        this.hdd = hdd;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "Цена=" + price +
                ", Модель='" + modelOfComputer + '\'' +
                ", RAM=" + ram.toString() +
                ", HDD=" + hdd.toString() +
                '}';
    }
}
