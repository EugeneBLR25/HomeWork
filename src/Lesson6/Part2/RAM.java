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

    @Override
    public String toString() {
        String descriptionOfHDD;
        if (nameOfRAM == null && spaceOfRAM == 0) {
            descriptionOfHDD = "{описание не доступно}";
        } else {
            descriptionOfHDD = "{" + "Название RAM='" + nameOfRAM + '\'' +
                    ", Объем RAM=" + spaceOfRAM + '}';
        }
        return descriptionOfHDD;
    }
}
