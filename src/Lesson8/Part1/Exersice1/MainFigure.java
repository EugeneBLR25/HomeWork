package Lesson8.Part1.Exersice1;

import java.text.DecimalFormat;

/**
 * Написать иерархию классов «Фигуры».
 * Фигура --> Треугольник --> Прямоугольник -->
 * Реализовать функцию подсчета площади для каждого типа фигуры и подсчет периметра.
 * Создать массив из 5 фигур.
 * Вывести на экран сумму периметра всех фигур в массиве.
 */
public class MainFigure {
    public static void main(String[] args) {

        //Создаю пять фигур, задаю их размеры
        Figure circle = new Circle("Круг", 12);
        Figure triangle1 = new Triangle("Треугольник", 10, 11, 12);
        Figure rectangle1 = new Rectangle("Прямоугольник", 12, 9);
        Figure triangle2 = new Triangle("Треугольник", 12, 9, 8);
        Figure rectangle2 = new Rectangle("Прямоугольник", 7, 13);

        //Помещаю созданные фигуры в массив
        Figure[] figures = new Figure[]{circle, triangle1, triangle2, rectangle1, rectangle2};

        //Создаю и инициализирую две переменные, цикл в котором вызываю методы подсчета периметра каждой
        //фигуры и его сумму и тоже самое с площадью каждой фигуры.
        double allPerimetr = 0;
        double allSquare = 0;
        for (int i = 0; i < figures.length; i++) {
            allPerimetr += figures[i].Perimetr();
            allSquare += figures[i].areaOfFigure();
        }

        //Вывод информации о суммах периметров и площадей фигур
        System.out.println("Периметр всех фигур: " + new DecimalFormat("#.###").format(allPerimetr));
        System.out.println("Площадь всех фигур: " + new DecimalFormat("#.###").format(allSquare));

    }
}
