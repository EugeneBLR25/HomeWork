package Lesson8.Part2.Documents;

import Lesson8.Part2.Controller.DocumentController;
import Lesson8.Part2.Documents.Documents;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EmployeeContract extends Documents {

    private String employeeName;
    String endOfcontract;

    public EmployeeContract() {
        super();
        this.endOfcontract = ednOfContract();
    }

    public EmployeeContract(int documentNumber, String employeeName) {
        super(documentNumber);
        this.employeeName = employeeName;
        this.endOfcontract = ednOfContract();

    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEndOfcontract() {
        return endOfcontract;
    }

    public void setEndOfcontract(String endOfcontract) {
        this.endOfcontract = endOfcontract;
    }

    //Метод для вывода информации о типе документа
    @Override
    public String getDocumentType() {
        return EMPLOYEE_CONTRACT;
    }

    //Дата окончания контракта с работником. Контракт заключается на год.
    public String ednOfContract() {
        Date endContr = new Date(new Date().getTime() + 31536000000L);
        SimpleDateFormat dataFormat = new SimpleDateFormat("dd.MM.YYYY");
        return dataFormat.format(endContr);
    }
}
