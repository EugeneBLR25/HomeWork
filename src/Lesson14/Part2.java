package Lesson14;

/**
 * 1. Создать три потока Т1, Т2 и Т3
 * Реализовать выполнение потоков в последовательности Т3 -> Т2 -> Т1. Выполнить 20 раз
 * (кроме метода join)
 * T3 выводит "Привет"
 * T2 выводит "Как дела?"
 * T1 выводит "Что делаешь?"
 */
public class Part2 {
    public static void main(String[] args) throws InterruptedException {
        for (int i =0; i<20; i++) {
            Thread t3 = new Thread(() -> {
                System.out.print("Привет. ");
            });
            t3.start();
            Thread.sleep(50);
            Thread t2 = new Thread(() -> {
                System.out.print("Как дела? ");
            });
            t2.start();
            Thread.sleep(50);
            Thread t1 = new Thread(() -> {
                System.out.println("Что делаешь?");
            });
            t1.start();
            Thread.sleep(50);
        }

    }
    }

