package Lesson12;

/**
 * Подписание карты работником и ознакомление работника с отчетом
 */
public interface WorkerSignCard {
    boolean isSignCard(WorkerCard workerCard);
    boolean isReadReport(Report report);
}
