package Lesson7.Clinica;

public class Patient {

    private String name;
    private int age;
    private PlanOfTreatment planOfTreatment;

    //Конструктор принимает и инициализирует поля класса. В объект Patient добавляется объект "плана лечения"
    public Patient(String name, int age, PlanOfTreatment planOfTreatment) {
        this.name = name;
        this.age = age;
        this.planOfTreatment = planOfTreatment;
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
    public PlanOfTreatment getPlanOfTreatment() {
        return planOfTreatment;
    }

    //Сеттер
    public void setPlanOfTreatment(PlanOfTreatment planOfTreatment) {
        this.planOfTreatment = planOfTreatment;
    }

    //Метод для назначения врача пациету и способа его лечения в клинике
    public void chooseDoctor(Clinica clinica) {
        int j = getPlanOfTreatment().getDisease();
        for (int i = 0; i < clinica.doctors.length; i++) {
            if (j == 1 && (clinica.doctors[i].getClass() == Surgeon.class)) {
                System.out.println("Для лечения назначен хирург.");
                clinica.doctors[i].treatment();
            } else if (j == 2 && (clinica.doctors[i].getClass() == Dantist.class)) {
                System.out.println("Для лечения назначен хирург.");
                clinica.doctors[i].treatment();
            } else if ((j != 1 && j != 2) && (clinica.doctors[i].getClass() == Therapist.class)) {
                System.out.println("Назначен терапевт.");
                clinica.doctors[i].treatment();
            }
        }

    }
}
