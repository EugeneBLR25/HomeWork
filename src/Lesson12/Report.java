package Lesson12;

import java.util.Objects;

public class Report {

    private int planOfProduction;
    private int productionFact;
    private double salary;
    private double bonus;
    private boolean isAcquaintance;
    private String dateOfRepotr;
    private WorkerCard workerCard;

    //Конструктор
    public Report(String dateOfRepotr, WorkerCard workerCard, int planOfProduction, int productionFact, double salary) {
        this.planOfProduction = planOfProduction;
        this.productionFact = productionFact;
        this.salary = salary;
        this.isAcquaintance = workerCard.getWorker().isReadReport(this);
        bonus = calculateBonus();
        this.dateOfRepotr = dateOfRepotr;
        workerCard.addReport(this);
    }

    //Геттер
    public int getPlanOfProduction() {
        return planOfProduction;
    }

    //Сеттер
    public void setPlanOfProduction(int planOfProduction) {
        this.planOfProduction = planOfProduction;
    }

    //Геттер
    public int getProductionFact() {
        return productionFact;
    }

    //Сеттер
    public void setProductionFact(int productionFact) {
        this.productionFact = productionFact;
    }

    //Геттер
    public double getSalary() {
        return salary;
    }
    //Сеттер
    public void setSalary(double salary) {
        this.salary = salary;
    }

    //Геттер
    public double getBonus() {
        return bonus;
    }

    //Сеттер
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    //Геттер
    public boolean isAcquaintance() {
        return isAcquaintance;
    }

    //Сеттер
    public void setAcquaintance(boolean acquaintance) {
        isAcquaintance = acquaintance;
    }

    //Геттер
    public WorkerCard getWorkerCard() {
        return workerCard;
    }
    //Сеттер
    public void setWorkerCard(WorkerCard workerCard) {
        this.workerCard = workerCard;
    }

    //Подсчет премии работника
    private double calculateBonus() {
        double premia = 0;
        if (productionFact >= 2 * planOfProduction) {
            premia = salary;
        } else if (productionFact >= 1.5 * planOfProduction && productionFact < 2 * planOfProduction) {
            premia = 0.5 * salary;
        }
        return premia;
    }

    @Override
    public String toString() {
        return "\nОтчет{ Дата отчета: " + dateOfRepotr + ", план продукции: " + planOfProduction +
                ", фактически произведено: " + productionFact +
                ", оклад: " + salary +
                ", премия: " + bonus +
                ", ознакомление: " + (isAcquaintance ? "ознакомлен" : "не ознакомлен");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Report report = (Report) o;
        return planOfProduction
                == report.planOfProduction && productionFact
                == report.productionFact && Double.compare(report.salary, salary)
                == 0 && Double.compare(report.bonus, bonus)
                == 0 && isAcquaintance
                == report.isAcquaintance && workerCard.equals(report.workerCard) && dateOfRepotr.equals(report.dateOfRepotr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workerCard, planOfProduction, productionFact, salary, bonus, isAcquaintance, dateOfRepotr);
    }
}
