package Lesson8.Part2;

import Lesson8.Part2.Documents.Documents;
import Lesson8.Part2.Documents.EmployeeContract;
import Lesson8.Part2.Documents.FinancicalDocument;
import Lesson8.Part2.Documents.ProductContract;
import Lesson8.Part2.Register.Registr;
import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;

/**
 * Создать систему для учета документов.
 * Создать класс Регистр, который будет иметь методы:
 * сохранения документа в регистре +
 * предоставление информации о документе +
 * Система может работать с тремя типами документов:
 * 1) Контракт на поставку товаров +
 * Содержит поля: Номер документа,Тип товаров,Количество товаров,Дата документа; +
 * 2) Контракт с сотрудником +
 * Содержит поля:Номер документа, Дата документа,Дата документа, Дата окончания контракта,Имя сотрудника;+
 * 3) Финансовая накладная: +
 * Содержит поля:Итоговая сумма за месяц,Дата документа,Номер документа, Код департамента. +
 * Класс регистр должен содержать внутри себя массив и при добавлении документа в регистр этот +
 * добавляемый документ должен добавляться в массив;+
 * Массив для класса регистра должен быть размером 10;+
 * Для полей "Дата документа" следует использовать тип данных Date; +
 * В методе предоставления информации о документе следует выводить на экран информацию о
 * переданном входным параметром документе;
 * Каждый класс для описания документов должен содержать конструктор с параметрами и без; +
 * Для имитации работы системы создайте класс Main, который будет содержать только один метод +
 * public static void main +
 * В этом методе напишите код для создания каждого из типов документов, добавления их в регистр и
 * вывода информации о документе;
 * Все классы разместить по пакетам; +
 * При выполнении задания использовать понятия интерфейсов и абстрактных классов. +
 */
public class Main {
    public static void main(String[] args) {
        //Создаю регистр
        Registr baseOfDocument = new Registr("База данных документов");

        //Создаю документы
        Documents productContract = new ProductContract(1, "Компьютеры", 20);
        Documents employeeContract = new EmployeeContract(2, "Иванов Петр");
        Documents financicalDocument = new FinancicalDocument(3, 2000, 45);
        Documents financicalDocument1 = new FinancicalDocument(3, 2000, 45);

        //Добавляю документы в реестр
        baseOfDocument.saveDocuments(productContract);
        baseOfDocument.saveDocuments(employeeContract);
        baseOfDocument.saveDocuments(financicalDocument);
        baseOfDocument.saveDocuments(financicalDocument1);

        //Вывожу сведения о документах
        baseOfDocument.showDocuments(productContract);
        baseOfDocument.showDocuments(employeeContract);
        baseOfDocument.showDocuments(financicalDocument);
    }
}
