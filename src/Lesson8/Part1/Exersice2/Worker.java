package Lesson8.Part1.Exersice2;

public class Worker extends Employee{

    public Worker(String name, int age, String jobTitle) {
        super(name, age, jobTitle);
    }

    //Имплементирую метод print() из интерфейса Printable
    @Override
    public void print() {
        System.out.println(WORKER);
    }
}
