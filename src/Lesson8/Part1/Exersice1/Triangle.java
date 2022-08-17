package Lesson8.Part1.Exersice1;

import Lesson8.Part1.Exersice1.Figure;

public class Triangle extends Figure {

    public Triangle(String nameOfFigure, double lenghtSide1, double lenghtSide2, double lenghtSide3) {
        super(nameOfFigure, lenghtSide1, lenghtSide2, lenghtSide3);
    }

    //Реализованный метод для подсчета периметра
    @Override
    public double Perimetr() {
        double perimetrOftriangle = this.getLenghtSide1() + this.getLenghtSide2() + this.getLenghtSide3();
        return perimetrOftriangle;
    }

    //Реализованный метод для подсчета площади фигуры
    @Override
    public double areaOfFigure() {
        double halfOfPerimetr = this.Perimetr() / 2;
        return Math.sqrt(halfOfPerimetr * (halfOfPerimetr - this.getLenghtSide1()) * (halfOfPerimetr - this.getLenghtSide2()) * (halfOfPerimetr - this.getLenghtSide3()));
    }
}
