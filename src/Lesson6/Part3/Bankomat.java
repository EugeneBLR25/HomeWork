package Lesson6.Part3;

import java.util.Scanner;

/**
 * Создать класс, описывающий банкомат.
 * Набор купюр, находящихся в банкомате, должен задаваться тремя свойствами:
 * количеством купюр номиналом 20, 50 и 100.
 * Сделать метод для добавления денег в банкомат.
 * Сделать функцию, снимающую деньги, которая принимает сумму денег, а возвращает булевое значение
 * - успешность выполнения операции.
 * При снятии денег функция должна распечатывать каким количеством купюр какого номинала выдаётся сумма.
 * Создать конструктор с тремя параметрами количеством купюр каждого номинала.
 */
public class Bankomat {
    int amount20;
    int amount50;
    int amount100;
    int amountMoneyInsideBankomat;

    public Bankomat(int amount20, int amount50, int amount100) {
        this.amount20 = amount20;
        this.amount50 = amount50;
        this.amount100 = amount100;
        amountMoneyInsideBankomat = amount20 * 20 + amount50 * 50 + amount100 * 100;
        System.out.println(lookBankomatSt());
    }

    public boolean checkBill(int putNominal20, int putNominal50, int putNominal100) {
        if (putNominal20 >= 0 && putNominal50 >= 0 && putNominal100 >= 0) {
            return true;
        } else {
            System.err.println("Некорректная сумма для пополнения.");
            return false;
        }
    }

    // Положить деньги в банкомат
    public void putMoneyInBankomat(int putNominal20, int putNominal50, int putNominal100) {
        if (checkBill(putNominal20, putNominal50, putNominal100)) {
            int putMoney = putNominal20 * 20 + putNominal50 * 50 + putNominal100 * 100;
            amountMoneyInsideBankomat += putMoney;
            amount20 += putNominal20;
            amount50 += putNominal50;
            amount100 += putNominal100;
            System.out.println("В банкомат добавлено: " + putMoney + "\nОбщая сумма в банкомате: " + amountMoneyInsideBankomat);
        }
        System.out.println(lookBankomatSt());

    }

    public boolean checkGetMoney(int takeOfMoney) {
        if (takeOfMoney > amountMoneyInsideBankomat || takeOfMoney <= 0) {
            System.err.println("Недостаточно средств или некорректно введена сумма.");
            return false;
        } else {
            return true;
        }
    }

    // Снятие денег с банкомата
    public boolean getMoneyFromBankomat(int takeOfMoney) {
        boolean isCorrect = checkGetMoney(takeOfMoney);
        if (isCorrect) {
            int[] bill = new int[]{amount20, amount50, amount100};
            int[] currency = new int[]{20, 50, 100};
            int[] almountGetMoney = new int[currency.length];
            for (int i = currency.length - 1; i >= 0; i--) {
                almountGetMoney[i] = takeOfMoney / currency[i];
                takeOfMoney = takeOfMoney % currency[i];
                if (i == (currency.length - 1))
                    amount100 = amount100 - almountGetMoney[i];
                if (i == (currency.length-2))
                    amount50 = amount50 - almountGetMoney[i];
                if (i == 0)
                    amount20 = amount20 - almountGetMoney[i];
                System.out.print("Купюр номиналом " + currency[i] + " - " + almountGetMoney[i] + " едениц;\n");
            }
            amountMoneyInsideBankomat = amount20 * 20 + amount50 * 50 + amount100 * 100;
            System.out.println(lookBankomatSt());
            return true;
        }else {
            return false;
        }
    }

    public String lookBankomatSt() {
        return "Bankomat{" +
                "Купюры номиналом 20 = " + amount20 +
                ", Купюры номиналом 50 = " + amount50 +
                ", Купюры номиналом 100 = " + amount100 +
                ", Общая сумма в банкомате = " + amountMoneyInsideBankomat +
                '}';
    }
}
