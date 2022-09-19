package Lesson14;

/**
 * 1. Создать три потока Т1, Т2 и Т3
 * Реализовать выполнение потоков в последовательности Т3 -> Т2 -> Т1. Выполнить 20 раз
 * (используя метод join)
 * T3 выводит "Привет"
 * T2 выводит "Как дела?"
 * T1 выводит "Что делаешь?"
 */
public class Part1 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 20; i++) {
            Thread t3 = new Thread(() -> {
                System.out.println("Привет. ");
            });
            t3.start();
            t3.join();
            Thread t2 = new Thread(() -> {
                System.out.println("Как дела? ");
            });
            t2.start();
            t2.join();
            Thread t1 = new Thread(() -> {
                System.out.println("Что делаешь?");
            });
            t1.start();
            t1.join();
        }
    }


}
