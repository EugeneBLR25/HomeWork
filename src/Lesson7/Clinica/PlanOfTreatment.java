package Lesson7.Clinica;

public class PlanOfTreatment {

    //Определение симптомов болезни
    private int disease;

    public PlanOfTreatment(int disease) {
        this.disease = disease;
    }

    public int getDisease() {
        return disease;
    }

    public void setDisease(int disease) {
        this.disease = disease;
    }
}
