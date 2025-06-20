package ru;

public class GeometryActions {

    public static double conversionSmToM(double sm) {
        double conversion =sm * 0.01;
        System.out.println("В " + sm + " сантиметров - " + conversion + " метров");
        return conversion;
    }

    public static double conversionMToSm(double m) {
        double conversion =m * 100;
        System.out.println("В " + m + " метров - " + conversion + " сантиметров");
        return conversion;
    }

    public static String compareArea(Shape shape1, Shape shape2) {
        double shareArea1 = shape1.calculateArea();
        double shareArea2 = shape2.calculateArea();

        if (shareArea1 > shareArea2) {
            return "Площадь первой фигуры больше второй";
        } else if (shareArea1 < shareArea2) {
            return "Площадь второй фигуры больше первой";
        } else {
            return "Площади фигур одинаковые";
        }
    }

    public static String comparePerimeter(Shape shape1, Shape shape2) {
        double sharePerimeter1 = shape1.calculatePerimeter();
        double sharePerimeter2 = shape2.calculatePerimeter();

        if (sharePerimeter1 > sharePerimeter2) {
            return "Периметр первой фигуры больше второй";
        } else if (sharePerimeter1 < sharePerimeter2) {
            return "Периметр второй фигуры больше первой";
        } else {
            return "Периметр фигур одинаковые";
        }
    }

}