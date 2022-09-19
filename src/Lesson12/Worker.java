package Lesson12;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Worker implements WorkerSignCard{

    private String nameOfWorker;
    private int ageOfWorker;
    private String dateStartWork;

    //Конструктор
    public Worker(String nameOfWorker, int ageOfWorker) {
        this.nameOfWorker = nameOfWorker;
        this.ageOfWorker = ageOfWorker;
        this.dateStartWork = startOfContract(); //Подписание контракта работником
    }

    //Геттер
    public String getNameOfWorker() {
        return nameOfWorker;
    }

    //Сеттер
    public void setNameOfWorker(String nameOfWorker) {
        this.nameOfWorker = nameOfWorker;
    }

    //Геттер
    public int getAgeOfWorker() {
        return ageOfWorker;
    }

    //Сеттер
    public void setAgeOfWorker(int ageOfWorker) {
        this.ageOfWorker = ageOfWorker;
    }

    //Геттер
    public String getDateStartWork() {
        return dateStartWork;
    }

    //Сеттер
    public void setDateStartWork(String dateStartWork) {
        this.dateStartWork = dateStartWork;
    }

    //Подписание контракта работником
    public String startOfContract() {
        Date startContr = new Date();
        SimpleDateFormat dataFormat = new SimpleDateFormat("dd.MM.YYYY");
        return dataFormat.format(startContr);
    }

    //Подписание карты работником
    @Override
    public boolean isSignCard(WorkerCard workerCard) {
        return true;
    }

    //Ознакомление работника с отчетом
    @Override
    public boolean isReadReport(Report report) {
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return ageOfWorker == worker.ageOfWorker && nameOfWorker.equals(worker.nameOfWorker) && dateStartWork.equals(worker.dateStartWork);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfWorker, ageOfWorker, dateStartWork);
    }
}
