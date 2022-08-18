package Lesson9.Part1;

public class Class5Exeption extends Exception{

    private String documentNumber;

    public Class5Exeption(String message, String documentNumber) {
        super(message);
        this.documentNumber=MainClass.DOCUMENT_NUMBER;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    @Override
    public String toString() {
        return this.getMessage()+" "+getDocumentNumber();
    }
}
