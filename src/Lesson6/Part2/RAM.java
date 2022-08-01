package Lesson6.Part2;

public class RAM {
    String nameOfRAM;
    int spaceOfRAM;

    public RAM() {

    }

    public RAM(String nameOfRAM, int spaceOfRAM) {
        this.nameOfRAM = nameOfRAM;
        this.spaceOfRAM = spaceOfRAM;
    }
    public String descriptionRAM(){
        String descriptionOfRAM;
        if (nameOfRAM == null && spaceOfRAM == 0) {
            descriptionOfRAM = "{описание не доступно}";
        } else {
            descriptionOfRAM = "{" + "Название RAM='" + nameOfRAM + '\'' +
                    ", Объем RAM=" + spaceOfRAM + '}';
        }
        return descriptionOfRAM;
    }
}
