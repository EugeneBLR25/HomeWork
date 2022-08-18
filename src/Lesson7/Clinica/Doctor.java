package Lesson7.Clinica;

import java.util.Objects;

//Абстрактный класс
public abstract class Doctor {

    private String typeOfDoctor;
    private String doctorName;
    private int qualification;

    //Геттер
    public String getTypeOfDoctor() {
        return typeOfDoctor;
    }

    //Сеттер
    public void setTypeOfDoctor(String typeOfDoctor) {
        this.typeOfDoctor = typeOfDoctor;
    }

    //Геттер
    public String getDoctorName() {
        return doctorName;
    }

    //Сеттер
    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    //Геттер
    public int getQualification() {
        return qualification;
    }

    //Сеттер
    public void setQualification(int qualification) {
        this.qualification = qualification;
    }

    //Конструктор
    public Doctor(String typeOfDoctor, String doctorName, int qualification) {
        this.typeOfDoctor = typeOfDoctor;
        this.doctorName = doctorName;
        this.qualification = qualification;
    }

    //Методы для сравнения объктов
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return qualification == doctor.qualification && doctorName.equals(doctor.doctorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(doctorName, qualification);
    }

    //Общий метод для всех классов наследников
    public void treatment() {
        System.out.println("Доктор лечит");
    }
}
