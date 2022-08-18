package Lesson7;

/**
 * Класс Phone.
 * Создайте класс Phone, который содержит переменные number, model и weight. +
 * Добавить конструктор без параметров.+
 * Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса
 * number, model.+
 * Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации
 * переменных класса number, model и weight.+
 * Вызвать из конструктора с тремя параметрами конструктор с двумя.+
 * Создайте три экземпляра этого класса.+
 * Выведите на консоль значения их переменных.+
 * Добавить в класс Phone методы:
 * receiveCall, имеет один параметр имя звонящего. Выводит на консоль сообщение
 * “Звонит {name}”. getNumber возвращает номер телефона. Вызвать эти методы для каждого из объектов.
 * Добавьте перегруженный метод receiveCall, который принимает два параметра имя звонящего и номер
 * телефона звонящего.
 * Вызвать этот метод.
 * Создать метод sendMessage с аргументами переменной длины. Данный метод принимает на вход номера
 * телефонов, которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.
 */
public class Phone {
    public static void main(String[] args) {

        //Создание трех объектов "Телефон"
        Phone samsung = new Phone("+375-29-808-80-47", "S8", 7);
        Phone apple = new Phone("+375-33-207-08-06", "13pro",5);
        Phone nokia = new Phone("+375-25-450-65-20","3310",4);

        //Добавление созданных объектов в массив
        Phone[] phoneArray = new Phone[]{samsung, apple, nokia};

        //Создание массива строк с именами людей
        String[] nameOfCalling = new String[]{"Петр",
                                            "Василий",
                                            "Георгий",
                                            "Андрей",
                                            "Виктор",
                                            "Мария",
                                            "Надежда"};

        //Создание массива строк с номерами телефонов
        String[] numberOfCalling = new String[]{"+375-29-208-30-30",
                                                "+375-29-111-30-10",
                                                "+375-29-525-30-25",
                                                "+375-29-365-54-45",
                                                "+375-29-501-21-30",
                                                "+375-29-742-30-44",
                                                "+375-29-654-55-65"};

        //Вызов медодов класса Phone у созданных объктов в цикле for
        for (int i = 0; i < phoneArray.length; i++) {
            int j = (int) (Math.random() * (nameOfCalling.length - 1));
            System.out.println("-----------------------------Телефон "+(i+1)+" ---------------------------------");
            System.out.println(phoneArray[i].showDescriptionOFPhone());
            phoneArray[i].receiveCall(nameOfCalling[(i)]);
            phoneArray[i].receiveCall(nameOfCalling[j], numberOfCalling[j]);
            phoneArray[i].sendMessage(numberOfCalling, phoneArray[i].getWeight());

        }
    }

    private String number;
    private String model;
    private int weight;

    //Конструткор по умолчанию
    public Phone() {
    }

    //Конструктор с 2-мя параметрами
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }
    //Конструтктор с тремя параметрами
    public Phone(String number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    //Геттер
    public String getNumber() {
        return number;
    }
    //Сеттер
    public void setNumber(String number) {
        this.number = number;
    }

    //Геттер
    public String getModel() {
        return model;
    }

    //Сеттер
    public void setModel(String model) {
        this.model = model;
    }

    //Геттер
    public int getWeight() {
        return weight;
    }
    //Сеттер
    public void setWeight(int weight) {
        this.weight = weight;
    }

    //Метод для вывода информации о телефоне
    public String showDescriptionOFPhone() {
        return "Модель: " + this.getModel() + ", номер: " + this.getNumber() + ", длина: " + this.getWeight();
    }

    //Метод звонка владельца телефона
    public void receiveCall(String callingName) {
        System.out.printf("Звонит %s " + this.getNumber()+"\n", callingName);
    }

    //Метод входящего звонка на телефон
    public void receiveCall(String callingName, String phoneNumber) {
        System.out.printf("Входящий вызов: %s %s\n", callingName, phoneNumber);
    }

    //Метод показывающий отправку сообщений на номера
    public void sendMessage(String[] almountOfNumber, int weight) {
        System.out.println("Сообщения отправлены на номера:");
        for (int i = 0; i < weight; i++) {
            System.out.println(almountOfNumber[i] + ";");
        }
    }
}
