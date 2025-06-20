package ru;

public class Sphere {
    private final double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    public double calculateSurfaceArea() {
        return 4 * Math.PI * radius * radius;
    }
}
