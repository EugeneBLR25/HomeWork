package Lesson9.Part2;

public class Exersise4 {

    private String cloneLetter;

    public Exersise4(String cloneLetter) {
        this.cloneLetter = cloneLetter;
    }

    public String getCloneLetter() {
        return cloneLetter;
    }

    public void setCloneLetter(String cloneLetter) {
        this.cloneLetter = cloneLetter;
    }
    //Метод удваивания каждого символа в строке
    public void doubleLetter() {
        StringBuilder stringBuilder = new StringBuilder(getCloneLetter());
        for (int i = 0, j = 0; i < getCloneLetter().length() * 2; i += 2, j++) {
            stringBuilder.insert(i, getCloneLetter().charAt(j));
        }
        System.out.println(stringBuilder);
    }

}
