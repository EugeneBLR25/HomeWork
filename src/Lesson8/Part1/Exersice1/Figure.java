package Lesson8.Part1.Exersice1;

/**
 * Создаю абстрактный класс Figure
 */
public abstract class Figure {

    private String nameOfFigure;
    private double lenghtSide1;
    private double lenghtSide2;
    private double lenghtSide3;

    //Конструктор для круга
    public Figure(String nameOfFigure, double lenghtSide1) {
        this.nameOfFigure = nameOfFigure;
        this.lenghtSide1 = lenghtSide1;
    }

    //Конструктор для фигур с двумя одинаковыми парными сторонами
    public Figure(String nameOfFigure, double lenghtSide1, double lenghtSide2) {
        this.nameOfFigure = nameOfFigure;
        this.lenghtSide1 = lenghtSide1;
        this.lenghtSide2 = lenghtSide2;
    }

    //Конструктор для треугольников
    public Figure(String nameOfFigure, double lenghtSide1, double lenghtSide2, double lenghtSide3) {
        this.nameOfFigure = nameOfFigure;
        this.lenghtSide1 = lenghtSide1;
        this.lenghtSide2 = lenghtSide2;
        this.lenghtSide3 = lenghtSide3;
    }

    //Геттер
    public String getNameOfFigure() {
        return nameOfFigure;
    }

    //Сеттер
    public void setNameOfFigure(String nameOfFigure) {
        this.nameOfFigure = nameOfFigure;
    }

    //Геттер
    public double getLenghtSide1() {
        return lenghtSide1;
    }

    //Сеттер
    public void setLenghtSide1(double lenghtSide1) {
        this.lenghtSide1 = lenghtSide1;
    }

    //Геттер
    public double getLenghtSide2() {
        return lenghtSide2;
    }

    //Сеттер
    public void setLenghtSide2(double lenghtSide2) {
        this.lenghtSide2 = lenghtSide2;
    }

    //Геттер
    public double getLenghtSide3() {
        return lenghtSide3;
    }

    //Сеттер
    public void setLenghtSide3(double lenghtSide3) {
        this.lenghtSide3 = lenghtSide3;
    }

    //Абстрактный метод для подсчета периметра фигуры
    public abstract double Perimetr();

    //Абстрактный метод для подсчета площади фигуры
    public abstract double areaOfFigure();

}
