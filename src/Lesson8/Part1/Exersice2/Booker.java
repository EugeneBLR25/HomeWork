package Lesson8.Part1.Exersice2;

public class Booker extends Employee{

    public Booker(String name, int age, String jobTitle) {
        super(name, age, jobTitle);
    }

    //Имплементирую метод print() из интерфейса Printable
    @Override
    public void print() {
        System.out.println(BOOKER);
    }
}
