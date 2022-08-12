package Lesson8.Part2.Documents;

import Lesson8.Part2.Controller.DocumentController;
import Lesson8.Part2.Documents.Documents;

import javax.xml.crypto.Data;

public class ProductContract extends Documents {

    private String productType;
    private int productAlmount;

    public ProductContract() {
        super();
    }

    public ProductContract(int documentNumber, String productType, int productAlmount) {
        super(documentNumber);
        this.productType = productType;
        this.productAlmount = productAlmount;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public int getProductAlmount() {
        return productAlmount;
    }

    public void setProductAlmount(int productAlmount) {
        this.productAlmount = productAlmount;
    }

    //Метод для вывода информации о типе документа
    @Override
    public String getDocumentType() {
        return PRODUCT_CONTRACT;
    }
}
