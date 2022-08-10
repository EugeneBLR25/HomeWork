package Lesson8.Part1.Exersice2;

public class Director extends Employee {


    public Director(String name, int age, String jobTitle) {
        super(name, age, jobTitle);
    }

    //Имплементирую метод print() из интерфейса Printable
    @Override
    public void print() {
        System.out.println(DIRECTOR);
    }
}
