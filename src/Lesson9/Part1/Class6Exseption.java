package Lesson9.Part1;

public class Class6Exseption extends Exception {

    private String documentNumber;

    public Class6Exseption(String message, String documentNumber) {
        super(message);
        this.documentNumber = MainClass.DOCUMENT_NUMBER;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    @Override
    public String toString() {
        return getMessage() + " в документе " + getDocumentNumber();
    }
}
