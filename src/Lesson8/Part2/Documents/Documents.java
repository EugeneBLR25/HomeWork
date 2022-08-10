package Lesson8.Part2.Documents;

import Lesson8.Part2.Controller.DocumentController;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public abstract class Documents implements DocumentController {

    private String dataOfDocument;
    private int documentNumber;

    public Documents() {
        this.dataOfDocument = setDataDocuments(); //Установка даты подписания документа
        dataOfDocument = null;
    }

    public Documents(int documentNumber) {
        this.dataOfDocument = setDataDocuments();
        this.documentNumber = documentNumber;
    }

    //Геттер
    public String getDataOfDocument() {
        return dataOfDocument;
    }
    //Сеттер
    public void setDataOfDocument(String dataOfDocument) {
        this.dataOfDocument = dataOfDocument;
    }

    //Геттер
    public int getDocumentNumber() {
        return documentNumber;
    }

    //Сеттер
    public void setDocumentNumber(int documentNumber) {
        this.documentNumber = documentNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Documents documents = (Documents) o;
        return documentNumber == documents.documentNumber && dataOfDocument.equals(documents.dataOfDocument);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataOfDocument, documentNumber);
    }

    //Дата подписания документа
    @Override
    public String setDataDocuments() {
        Date data = new Date();
        SimpleDateFormat dataFormat = new SimpleDateFormat("dd.MM.YYYY");
        return dataFormat.format(data);
    }
}
