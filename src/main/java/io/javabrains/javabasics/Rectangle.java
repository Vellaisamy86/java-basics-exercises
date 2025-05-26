package io.javabrains.javabasics;

public class Rectangle {
    private double length;
    private double width;
    private static int numOfRectangles = 0;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        numOfRectangles++;
    }

    // Method to calculate area
    public double getArea() {
        return length * width;
    }

    // Method to calculate perimeter
    public double getPerimeter() {
        return 2 * (length + width);
    }

    // Getters and Setters
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public static int getNumOfRectangles() {
        // This method returns the number of rectangles created
        return numOfRectangles;
    }
}