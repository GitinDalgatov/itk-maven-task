package ru;

public class Rectangle extends Shape { //прямоугольник

    private final double side1;
    private final double side2;

    public Rectangle(int side1, int side2) {
        if (side1 <= 0 || side2 <= 0) {
            throw new IllegalArgumentException("Стороны треугольника должны быть положительным числом.");
        }
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double calculateArea() {
        return side1 * side2;
    }

    @Override
    public double calculatePerimeter() {
        return (side1 + side2) * 2;
    }

}
