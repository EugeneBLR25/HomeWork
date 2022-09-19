package Lesson12;

/**
 * Программа «Бухгалтерия»
 * Напишите программу, которая будет заносить информацию в личную карту работника.
 * Содержание карты:
 * - Информация о работнике
 * - Отчет по каждому месяцу (за 2-3 года). Содержимое отчета:
 * - Поставленный план по производству продукции
 * - Факт выполнения
 * - Размер оклада
 * - Размер премии (из размера: премия = оклад, если факт выполнения = 2 * план по производству; если факт выполнение 1.5 * план – премия 0.5
 * оклада и т.д.)
 * - Сотрудник ознакомлен
 * - Номер карты
 * - Дата создания карты = дата трудоустройства работника
 * - Факт простановки всех подписей работником
 * Бухгалтерия, после обновления карты работника (первоначальное заполнение + заполнение по текущему месяцу),
 * отправляет карту работнику на подпись (ознакомление). Работник ВСЕГДА обязан подписывать документ.
 * Использовать интерфейс Map. Обеспечить вывод информации на экран (история по документу)
 */
public class Main {
    public static void main(String[] args) {

        //Создание карт работников
        WorkerCard workerCard1=new WorkerCard(new Worker("Алексей Иванов", 30));
        WorkerCard workerCard2=new WorkerCard(new Worker("Иван Петров", 40));

        //Добавление отчетов по первому работнику за последние 2 года
        new Report("01.08.2022",workerCard1,100,120,1000);
        new Report("01.07.2022",workerCard1,150,100,900);
        new Report("01.06.2022",workerCard1,150,100,800);
        new Report("01.05.2022",workerCard1,550,800,2000);
        new Report("01.04.2022",workerCard1,150,100,1000);
        new Report("01.03.2022",workerCard1,500,300,500);
        new Report("01.02.2022",workerCard1,150,100,600);
        new Report("01.01.2022",workerCard1,150,400,800);
        new Report("01.12.2021",workerCard1,240,100,850);
        new Report("01.11.2021",workerCard1,150,100,1500);
        new Report("01.10.2021",workerCard1,320,500,2000);
        new Report("01.09.2021",workerCard1,150,100,300);
        new Report("01.08.2021",workerCard1,200,600,900);
        new Report("01.07.2021",workerCard1,150,100,900);
        new Report("01.06.2021",workerCard1,135,150,500);
        new Report("01.05.2021",workerCard1,150,200,900);
        new Report("01.04.2021",workerCard1,140,100,900);
        new Report("01.03.2021",workerCard1,150,100,900);
        new Report("01.02.2021",workerCard1,150,300,2000);
        new Report("01.01.2021",workerCard1,150,400,900);
        new Report("01.12.2020",workerCard1,120,100,3500);
        new Report("01.11.2020",workerCard1,110,500,900);
        new Report("01.10.2020",workerCard1,100,100,950);
        new Report("01.09.2020",workerCard1,90,100,900);
        new Report("01.08.2020",workerCard1,80,130,1000);

        //Отчеты по второму работнику за последние 2 года
        new Report("01.08.2022",workerCard2,100,120,1000);
        new Report("01.07.2022",workerCard2,150,100,900);
        new Report("01.06.2022",workerCard2,150,100,800);
        new Report("01.05.2022",workerCard2,550,800,2000);
        new Report("01.04.2022",workerCard2,150,100,1000);
        new Report("01.03.2022",workerCard2,500,300,500);
        new Report("01.02.2022",workerCard2,150,100,600);
        new Report("01.01.2022",workerCard2,150,400,800);
        new Report("01.12.2021",workerCard2,240,100,850);
        new Report("01.11.2021",workerCard2,150,100,1500);
        new Report("01.10.2021",workerCard2,320,500,2000);
        new Report("01.09.2021",workerCard2,150,100,300);
        new Report("01.08.2021",workerCard2,200,600,900);
        new Report("01.07.2021",workerCard2,150,100,900);
        new Report("01.06.2021",workerCard2,135,150,500);
        new Report("01.05.2021",workerCard2,150,200,900);
        new Report("01.04.2021",workerCard2,140,100,900);
        new Report("01.03.2021",workerCard2,150,100,900);
        new Report("01.02.2021",workerCard2,150,300,2000);
        new Report("01.01.2021",workerCard2,150,400,900);
        new Report("01.12.2020",workerCard2,120,100,3500);
        new Report("01.11.2020",workerCard2,110,500,900);
        new Report("01.10.2020",workerCard2,100,100,950);
        new Report("01.09.2020",workerCard2,90,100,900);
        new Report("01.08.2020",workerCard2,80,130,1000);

        //Получение информации о картах работников из бухгалтерии
        Bookkeeping.showCard(workerCard1);
        Bookkeeping.showCard(workerCard2);




    }
}
