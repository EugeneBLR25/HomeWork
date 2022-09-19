package Lesson12;

import java.util.HashMap;
import java.util.Objects;

public class Bookkeeping {

    //Объявление Map для сохранения карт работников
    public static final HashMap<Worker, WorkerCard> BOOKKEEPING_REGISTER = new HashMap<>();

    public static void showCard(WorkerCard workerCard){
        System.out.println(BOOKKEEPING_REGISTER.get(workerCard.getWorker()));
    }

    //Удаление карты работника
    public static void deleteCard(WorkerCard workerCard){
        BOOKKEEPING_REGISTER.remove(workerCard.getWorker());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bookkeeping that = (Bookkeeping) o;
        return BOOKKEEPING_REGISTER.equals(BOOKKEEPING_REGISTER);
    }

    @Override
    public int hashCode() {
        return Objects.hash(BOOKKEEPING_REGISTER);
    }
}
