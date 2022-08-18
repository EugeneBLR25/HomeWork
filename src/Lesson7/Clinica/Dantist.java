package Lesson7.Clinica;

public class Dantist extends Doctor{

    //Отдельная переменная класса
    private String instrumentForTeeth;

    //Конструктор с параметрами родительского класса и отдельного свойствва данного класса
    public Dantist(String typeOfDoctor, String doctorName, int qualification, String instrumentForTeeth) {
        super(typeOfDoctor, doctorName, qualification);
        this.instrumentForTeeth = instrumentForTeeth;
    }

    public String getInstrumentForTeeth() {
        return instrumentForTeeth;
    }

    public void setInstrumentForTeeth(String instrumentForTeeth) {
        this.instrumentForTeeth = instrumentForTeeth;
    }

    //Переопределенный метод родительского класса
    @Override
    public void treatment() {
        System.out.println("Дантист лечит......");
    }
}
