package Lesson7.Clinica;

//Наследуемся от класса Doctor
public class Surgeon extends Doctor {

    //Отдельная переменная класса
    private String surgeonType;

    //Конструктор с параметрами родительского класса и отдельного свойствва данного класса
    public Surgeon(String typeOfDoctor, String doctorName, int qualification, String surgeonType) {
        super(typeOfDoctor, doctorName, qualification);
        this.surgeonType = surgeonType;
    }

    public String getSurgeonType() {
        return surgeonType;
    }

    public void setSurgeonType(String surgeonType) {
        this.surgeonType = surgeonType;
    }

    //Переопределенный метод из родительского класса
    @Override
    public void treatment() {
        System.out.println("Хирург лечит.......");
    }
}
