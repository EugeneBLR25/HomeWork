package Lesson6.Part2;

public class HDD {
    String nameOfHDD;
    int spaceOFHDD;
    String typeofHDD;

    public HDD() {

    }

    public HDD(String nameOfHDD, int spaceOFHDD, String typeofHDD) {
        this.nameOfHDD = nameOfHDD;
        this.spaceOFHDD = spaceOFHDD;
        this.typeofHDD = typeofHDD;
    }
    public String descriptionHDD(){
        String descriptionOfHDD;
        if (nameOfHDD == null && typeofHDD == null && spaceOFHDD == 0) {
            descriptionOfHDD="{описание не доступно}";

        } else {
            descriptionOfHDD="{" + "Имя HDD='" + nameOfHDD + '\'' +
                    ", Объем HDD=" + spaceOFHDD +
                    ", Тип HDD='" + typeofHDD + '\'' +
                    '}';
        }
        return descriptionOfHDD;
    }
}
