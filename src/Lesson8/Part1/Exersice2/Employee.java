package Lesson8.Part1.Exersice2;

//Создаю адстрактный класс для описания должностей в организации
public abstract class Employee implements Printable {
    private String name;
    private int age;
    private String jobTitle;

    //Констутор
    public Employee(String name, int age, String jobTitle) {
        this.name = name;
        this.age = age;
        this.jobTitle = jobTitle;
    }

    //Геттер
    public String getName() {
        return name;
    }

    //Сеттер
    public void setName(String name) {
        this.name = name;
    }

    //Геттер
    public int getAge() {
        return age;
    }

    //Сеттер
    public void setAge(int age) {
        this.age = age;
    }

    //Геттер
    public String getJobTitle() {
        return jobTitle;
    }

    //Сеттер
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}
