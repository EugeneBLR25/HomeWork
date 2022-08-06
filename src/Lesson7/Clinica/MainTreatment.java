package Lesson7.Clinica;

/**
 * Создать программу для имитации работы клиники.
 * Пусть в клинике будет три врача: хирург, терапевт и дантист.
 * Каждый врач имеет метод «лечить», но каждый врач лечит по своему.
 * Так же предусмотреть класс «Пациент» и класс «План лечения».
 * Создать объект класса «Пациент» и добавить пациенту план лечения.
 * Так же создать метод, который будет назначать врача пациенту согласно плану лечения.
 * Если план лечения имеет код 1 назначить хирурга и выполнить метод лечить.
 * Если план лечения имеет код 2 назначить дантиста и выполнить метод лечить.
 * Если план лечения имеет любой другой код назначить терапевта и выполнить метод лечить.
 */
public class MainTreatment {
    public static void main(String[] args) {
        //Создаем объкт класса клиника
        Clinica childHospital = new Clinica("БСМП", "Советская 23");

        //Создаем трех докторов
        Doctor surgeon = new Surgeon("Хирург", "Василий Хирургов", 4, "Детский хирург");
        Doctor therapist = new Therapist("Терапевт", "Жанна Терапевтовна", 3, "Женский");
        Doctor dantist = new Dantist("Дантист", "Василий Хирургов", 4, "Пломбы");

        //Добавляем докторов к созданную клинику
        childHospital.addDoctors(surgeon);
        childHospital.addDoctors(therapist);
        childHospital.addDoctors(dantist);

        //Создаем трех пациентов
        Patient patient1 = new Patient("Иван Иванов", 30, new PlanOfTreatment(1));
        Patient patient2 = new Patient("Иван Иванов", 30, new PlanOfTreatment(2));
        Patient patient3 = new Patient("Иван Иванов", 30, new PlanOfTreatment(4));

        //Пациенту в клинике назначают врача исходя из плана лечения, который начинает лечить пациента
        patient1.chooseDoctor(childHospital);
        patient2.chooseDoctor(childHospital);
        patient3.chooseDoctor(childHospital);


    }
}
