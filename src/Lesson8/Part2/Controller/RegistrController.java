package Lesson8.Part2.Controller;

import Lesson8.Part2.Documents.Documents;

//Интерфейс управления регистром
public interface RegistrController {

    //Сохрание документа в регистре
    void saveDocuments(Documents documents);

    //Показ документа
    void showDocuments(Documents documents);

    //Проверка наличия документа в регистре
    boolean checkDocumentInRegister(Documents documents);

    //Уведомление о добавлении или невозможности добавления в регистр
    void notationAddDocument(Documents documents, boolean b);
}
