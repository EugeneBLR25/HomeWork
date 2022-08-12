package Lesson8.Part1.Exersice1;

import Lesson8.Part1.Exersice1.Figure;

public class Rectangle extends Figure {

    public Rectangle(String nameOfFigure, double lenghtSide1, double lenghtSide2) {
        super(nameOfFigure, lenghtSide1, lenghtSide2);
    }

    //Реализованный метод для подсчета периметра
    @Override
    public double Perimetr() {
        double perimetrOfRectangle = this.getLenghtSide1() * 2 + this.getLenghtSide2() * 2;
        return perimetrOfRectangle;
    }

    //Реализованный метод для подсчета площади фигуры
    @Override
    public double areaOfFigure() {
        return this.getLenghtSide1() * this.getLenghtSide2();
    }
}
