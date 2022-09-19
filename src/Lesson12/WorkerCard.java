package Lesson12;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WorkerCard {
    Bookkeeping bookkeeping;
    private static int counterOfCard=1;
    private Worker worker;
    private List<Report> reportList;
    private Report report;
    private int numberOfCard;
    private String dateOfCreateCard;
    private boolean isSign;

    //Конструктор
    public WorkerCard(Worker worker) {
        this.worker = worker;
        this.reportList = new ArrayList<>();
        this.numberOfCard = counterOfCard++;
        this.dateOfCreateCard = worker.getDateStartWork();
        this.isSign = worker.isSignCard(this);
        Bookkeeping.BOOKKEEPING_REGISTER.put(worker,this);
    }

    //Геттер
    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    //Геттер
    public int getNumberOfCard() {
        return numberOfCard;
    }

    //Сеттер
    public void setNumberOfCard(int numberOfCard) {
        this.numberOfCard = numberOfCard;
    }

    //Геттер
    public String getDateOfCreateCard() {
        return dateOfCreateCard;
    }

    //Сеттер
    public void setDateOfCreateCard(String dateOfCreateCard) {
        this.dateOfCreateCard = dateOfCreateCard;
    }

    //Геттер
    public boolean isSign() {
        return isSign;
    }

    //Сеттер
    public void setSign(boolean sign) {
        isSign = sign;
    }

    //Геттер
    public List<Report> getReportList() {
        return reportList;
    }

    //Сеттер
    public void setReportList(List<Report> reportList) {
        this.reportList = reportList;
    }

    //Добавление нового отчета в карту работника
    public void addReport(Report report) {
        reportList.add(report);
        isSign = this.worker.isSignCard(this);
    }

    @Override
    public String toString() {
        return "Номер карты работника: № " + numberOfCard+" от "+dateOfCreateCard+"\n"+
                "Работник: " + worker.getNameOfWorker() +"\n"+
                "Список отчетов: \n" + reportList +
                "\nПодписи: " + (isSign ? "Карта подписана.":"Карта не подписана.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkerCard that = (WorkerCard) o;
        return numberOfCard == that.numberOfCard && isSign == that.isSign && worker.equals(that.worker) && reportList.equals(that.reportList) && report.equals(that.report) && dateOfCreateCard.equals(that.dateOfCreateCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(worker, reportList, report, numberOfCard, dateOfCreateCard, isSign);
    }
}
