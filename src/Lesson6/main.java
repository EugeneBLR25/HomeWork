package Lesson6;

import Lesson6.Part1.CreditCard;
import Lesson6.Part2.Computer;
import Lesson6.Part2.HDD;
import Lesson6.Part2.RAM;
import Lesson6.Part3.Bankomat;

public class main {
    public static void main(String[] args) {
        // Обязательная часть
        CreditCard visa = new CreditCard(12345, 0);
        CreditCard masterCard = new CreditCard(12389, 100);
        CreditCard mir = new CreditCard(12345, 200);
        visa.putMoneyOnAccount(322.21);
        masterCard.putMoneyOnAccount(188.15);
        mir.getMoneyFromAccount(100.16);
        visa.checkOfAccount();
        masterCard.checkOfAccount();
        mir.checkOfAccount();

        System.out.println("--------------------------------------------------------------------------");

        //Необязательная часть 1
        Computer computer1 = new Computer(500.0, "Apple");
        Computer computer2 = new Computer(700.0, "HP", new RAM("DH500", 8),
                new HDD("QWWQ12", 4, "Внешний"));
        System.out.println(computer1.toString());
        System.out.println(computer2.toString());

        System.out.println("--------------------------------------------------------------------------");

        //Необязательная часть 2
        Bankomat bankomat=new Bankomat(1,1,1);
        bankomat.putMoneyInBankomat(1,1,1);
        bankomat.putMoneyInBankomat(1,1,1);
        bankomat.getMoney();

    }
}
