package Lesson9.Part2;

public class Exersise3Exeption extends Exception{

    private int numberWords;

    public Exersise3Exeption(int numberWords) {
        this.numberWords = numberWords;
    }

    public int getNumberWords() {
        return numberWords;
    }

    public void setNumberWords(int numberWords) {
        this.numberWords = numberWords;
    }

    @Override
    public String toString() {
        return "Ошибка 1: " + numberWords + " слово отсутсвует в строке. Введите корректное число слова в строке";
    }
}
