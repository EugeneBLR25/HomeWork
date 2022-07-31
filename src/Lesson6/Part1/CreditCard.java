package Lesson6.Part1;

/**
 * Создать класс CreditCard c полями номер счета, текущая сумма на счету.+
 * Добавьте метод, который позволяет начислять сумму на кредитную карточку.+
 * Добавьте метод, который позволяет снимать с карточки некоторую сумму.+
 * Добавьте метод, который выводит текущую информацию о карточке.+
 * Напишите программу, которая создает три объекта класса CreditCard у которых заданы номер
 * счета и начальная сумма+
 * Тестовый сценарий для проверки:
 * Положите деньги на первые две карточки и снимите с третьей.
 */
public class CreditCard {
    int idBankAccount;
    double moneyOnAccount;

    public CreditCard(int idBankAccount, double moneyOnAccount) { //Конструктор с проверкой отрицательного баланса
        this.idBankAccount = idBankAccount;
        if (moneyOnAccount >= 0) {
            this.moneyOnAccount = moneyOnAccount;
        } else {
            System.err.println("Счет не может быть меньше 0.");
        }
    }
    // Положить деньги
    public void putMoneyOnAccount(double amountOfMoney) {
        if (amountOfMoney > 0) {
            moneyOnAccount += amountOfMoney;
        } else {
            System.err.println("Невозможно положить деньги на счет.");
        }
    }
    // Получить деньги
    public void getMoneyFromAccount(double amountOfMoney) {
        if (moneyOnAccount >= amountOfMoney && amountOfMoney > 0) {
            moneyOnAccount -= amountOfMoney;
        } else {
            System.err.println("Недостаточно средств для снятия.");
        }
    }
    public void checkOfAccount(){
        System.out.println(toString());
    }
    //Вывод информации по счету
    @Override
    public String toString() {
        return "CreditCard{" + "Номер счета:" + idBankAccount +
                ", Количество денег на счете:" + moneyOnAccount +'}';
    }
}
