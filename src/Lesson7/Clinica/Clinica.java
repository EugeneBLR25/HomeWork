package Lesson7.Clinica;

import java.security.spec.RSAOtherPrimeInfo;

public class Clinica {

    private static final int ALMOUNT_DOCTORS = 3;
    private String clinicaName;
    private String adressOfClinica;
    Doctor[] doctors;

    public Clinica(String clinicaName, String adressOfClinica) {
        this.clinicaName = clinicaName;
        this.adressOfClinica = adressOfClinica;
        doctors = new Doctor[ALMOUNT_DOCTORS];
    }

    public String getClinicaName() {
        return clinicaName;
    }

    public void setClinicaName(String clinicaName) {
        this.clinicaName = clinicaName;
    }

    public String getAdressOfClinica() {
        return adressOfClinica;
    }

    public void setAdressOfClinica(String adressOfClinica) {
        this.adressOfClinica = adressOfClinica;
    }

    public void addDoctors(Doctor doctor) {
        for (int i = 0; i < doctors.length; i++) {
            if (doctors[i] == null) {
                doctors[i] = doctor;
                break;
            }
        }
    }

    public void remoteDoctor(Doctor doctor) {
        for (int i = 0; i < doctors.length; i++) {
            if (doctors[i].equals(doctor)) {
                doctors[i] = null;
            }
        }
    }
}



