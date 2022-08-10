package Lesson8.Part2.Documents;

import Lesson8.Part2.Controller.DocumentController;
import Lesson8.Part2.Documents.Documents;

import javax.xml.crypto.Data;

public class FinancicalDocument extends Documents {

    private int mounthSumm;
    private int codeOfDepartament;

    public FinancicalDocument() {
        super();
    }

    public FinancicalDocument(int documentNumber, int mounthSumm, int codeOfDepartament) {
        super(documentNumber);
        this.mounthSumm = mounthSumm;
        this.codeOfDepartament = codeOfDepartament;
    }

    public int getMounthSumm() {
        return mounthSumm;
    }

    public void setMounthSumm(int mounthSumm) {
        this.mounthSumm = mounthSumm;
    }

    public int getCodeOfDepartament() {
        return codeOfDepartament;
    }

    public void setCodeOfDepartament(int codeOfDepartament) {
        this.codeOfDepartament = codeOfDepartament;
    }

    //Метод для вывода информации о типе документа
    @Override
    public String getDocumentType() {
        return FINANSICAL_DOCUMENT;
    }
}
