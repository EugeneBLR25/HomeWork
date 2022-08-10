package Lesson8.Part2.Register;

import Lesson8.Part2.Documents.Documents;
import Lesson8.Part2.Controller.RegistrController;
import org.w3c.dom.ls.LSOutput;

public class Registr implements RegistrController {

    private String nameOfRegister;
    Documents[] documentsArr;

    //Конструктор
    public Registr(String nameOfRegister) {
        this.nameOfRegister = nameOfRegister;
        documentsArr = new Documents[10];
    }

    //Геттер
    public String getNameOfRegister() {
        return nameOfRegister;
    }

    //Сеттер
    public void setNameOfRegister(String nameOfRegister) {
        this.nameOfRegister = nameOfRegister;
    }

    //Геттер
    public Documents[] getDocuments() {
        return documentsArr;
    }

    //Сеттер
    public void setDocuments(Documents[] documents) {
        this.documentsArr = documents;
    }

    //Метод сохранениядокументов в регистр
    @Override
    public void saveDocuments(Documents documents) {
        boolean isGood = checkDocumentInRegister(documents);
        if (isGood) {
            for (int i = 0; i < documentsArr.length; i++) {
                if (documentsArr[i] == null) {
                    documentsArr[i] = documents;
                    notationAddDocument(documents, isGood);
                    break;
                }
            }
        } else {
            notationAddDocument(documents, isGood);
        }
    }

    //Метод вывлда информации о документе
    @Override
    public void showDocuments(Documents documents) {
        System.out.printf("%s №%d от %s.\n", documents.getDocumentType(), documents.getDocumentNumber(), documents.getDataOfDocument());
    }

    //Проверка документа в регистре
    @Override
    public boolean checkDocumentInRegister(Documents documents) {
        boolean isGood = true;
        for (int i = 0; i < documentsArr.length; i++) {
            if (documents.equals(documentsArr[i])) {
                isGood = false;
                break;
            }
        }
        return isGood;
    }

    //Вывод информации о статусе документа при добавлении в регистр
    @Override
    public void notationAddDocument(Documents documents, boolean b) {
        if (b) {
            System.out.printf("%s №%d от %s успешно добавлен в регистр.\n", documents.getDocumentType(), documents.getDocumentNumber(), documents.getDataOfDocument());
        } else {
            System.out.printf("---Ошибка.Данная %s уже находится в регистре---\n", documents.getDocumentType());
        }
    }
}
