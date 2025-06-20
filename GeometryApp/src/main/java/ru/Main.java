package ru;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(2, 3, 4);
        System.out.println("Площадь треугольника: " + triangle.calculateArea());
        System.out.println("Периметр треугольника: " + triangle.calculatePerimeter());
        Rectangle rectangle = new Rectangle(4, 5);
        System.out.println("Площадь прямоугольника: " + rectangle.calculateArea());
        System.out.println("Периметр прямоугольника: " + rectangle.calculatePerimeter());
        Circle circle = new Circle(3);
        System.out.println("Площадь круга: " + circle.calculateArea());
        System.out.println("Периметр круга: " + circle.calculatePerimeter());
        System.out.println(GeometryActions.compareArea(triangle, rectangle));
        System.out.println(GeometryActions.comparePerimeter(triangle, rectangle));
        GeometryActions.conversionSmToM(10000);
        GeometryActions.conversionMToSm(100);
        Cube cube = new Cube(3);
        Sphere sphere = new Sphere(4);
        System.out.println("Объем куба: " + cube.calculateVolume());
        System.out.println("Площадь поверхности: " + sphere.calculateSurfaceArea());
    }
}