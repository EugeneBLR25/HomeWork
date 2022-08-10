package Lesson8.Part1.Exersice1;

public class Circle extends Figure {

    //Константа для числа PI
    private static final double PI = Math.PI;

    public Circle(String nameOfFigure, double lenghtSide1) {
        super(nameOfFigure, lenghtSide1);
    }

    //Реализованный метод для подсчета периметра
    @Override
    public double Perimetr() {
        double perimetrOfcircle = 2 * this.getLenghtSide1() * PI;
        return perimetrOfcircle;
    }

    //Реализованный метод для подсчета площади фигуры
    @Override
    public double areaOfFigure() {
        return Math.pow(this.getLenghtSide1(), 2) * PI;
    }
}
