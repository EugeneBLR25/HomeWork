package Lesson8.Part2.Controller;

//Интерфейс для управления документами
public interface DocumentController {

    String PRODUCT_CONTRACT = "Контракт на товар";
    String EMPLOYEE_CONTRACT = "Контракт с сотрудником";
    String FINANSICAL_DOCUMENT = "Финансовая накладная";

    //Метод вывода типа документа
    String getDocumentType();

    //Метод установки даты подписания документа
    String setDataDocuments();

}
