package Lesson7.Clinica;

public class Therapist extends Doctor {

    //Отдельная переменная данного класса
    private String sex;

    //Конструктор с параметрами родительского класса и отдельного свойствва данного класса
    public Therapist(String typeOfDoctor, String doctorName, int qualification, String sex) {
        super(typeOfDoctor, doctorName, qualification);
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    //Переопределенный метод родительского класса
    @Override
    public void treatment() {
        System.out.println("Терапевт лечит.......");
    }
}
