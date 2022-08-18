package Lesson9.Part2;

public class Exersise1 {

    private String randomString;

    public Exersise1(String randomString) {
        this.randomString = randomString;
    }

    public String getRandomString() {
        return randomString;
    }

    public void setRandomString(String randomString) {
        this.randomString = randomString;
    }

    //Поиск самого короткого последнего слова
    public void findShorterString() {
        String[] array = repairString();
        int minLen = array[0].length(), indexMin = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() < minLen || array[i].length() == minLen) {
                minLen = array[i].length();
                indexMin = i;
            }
        }
        System.out.println("Последнее самое короткое слово: " + array[indexMin]);
    }
    //Поиск самого длинного последнего слова
    public void findLongerString() {
        repairString();
        String[] array = repairString();
        int maxLen = array[0].length(), indexMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > maxLen || array[i].length() == maxLen) {
                maxLen = array[i].length();
                indexMax = i;
            }
        }
        System.out.println("Последнее самое длинное слово: " + array[indexMax]);
    }
    //Метод преобразования строки в массив
    private String[] repairString() {
        String[] arrayWithoutSimbols = getRandomString().replaceAll("[^A-Za-zА-Яа-я0-9]", " ")
                .trim()
                .split(" +");
        return arrayWithoutSimbols;
    }

}
