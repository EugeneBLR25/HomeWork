package Lesson9.Part2;

public class Exersise2 {

    private String experimentString;

    public Exersise2(String experimentString) {
        this.experimentString = experimentString;
    }

    public String getExperimentString() {
        return experimentString;
    }

    public void setExperimentString(String experimentString) {
        this.experimentString = experimentString;
    }

    //Метод преобразования строки в массив
    private String[] repairString() {
        String[] arrayWithoutSimbols = getExperimentString().replaceAll("[^A-Za-zА-Яа-я0-9]", " ")
                .trim()
                .split(" +");
        return arrayWithoutSimbols;
    }

    //Метод преобразования массивов строк в массив символов, массива символов в целочисленный массив
    private int[] makeCharIntArray(String[] array) {
        char[][] arrChar = new char[array.length][];
        for (int i = 0; i < array.length; i++) {
            arrChar[i] = array[i].toCharArray();
        }

        int[] cointRepeatSymbols = new int[array.length];
        for (int i = 0; i < arrChar.length; i++) {
            if (arrChar[i].length == 1 || arrChar[i].length == 2) {
                cointRepeatSymbols[i] = -1;
                continue;
            }
            for (int j = 0; j < arrChar[i].length; j++) {
                if (i == j || j == (arrChar[i].length - 1)) {
                    continue;
                }
                if (arrChar[i][j] == arrChar[i][j + 1]) {
                    continue;
                } else {
                    cointRepeatSymbols[i] += 1;
                }
            }
        }
        return cointRepeatSymbols;
    }

    //Поиск слова с минимальным количеством повторяющихся символов, исключая предлоги
    public void findMinAlmountSymbols() {
        int[] countArray = makeCharIntArray(repairString());
        int minLen = countArray[0], indexMin = 0;
        for (int i = 0; i < countArray.length; i++) {
            if (countArray[i] < 0) {
                continue;
            }
            if (countArray[i] < minLen || countArray[i] == minLen) {
                minLen = countArray[i];
                indexMin = i;
            }
        }
        System.out.println("Слово с минимальным количеством повторяющихся символов: "+repairString()[indexMin]);
    }
}
