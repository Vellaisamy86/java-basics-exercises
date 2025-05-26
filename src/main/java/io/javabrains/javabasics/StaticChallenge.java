package io.javabrains.javabasics;

/*
Create a class `Rectangle` with the following attributes: `width`, `height`, and a static variable `numOfRectangles` which will keep track of the number of rectangles created.

1.  Create a constructor that takes the width and height as arguments and sets the values of the `width` and `height` instance variables.
2.  Create a method `getArea` that calculates and returns the area of the rectangle.
3.  Create a method `getPerimeter` that calculates and returns the perimeter of the rectangle.
4.  Create a method `getNumOfRectangles` that returns the value of the `numOfRectangles` static variable.
5.  In this main method, create several `Rectangle` objects, calculate and print their area and perimeter, and finally print the number of rectangles created without keeping count in this class.
 */

public class StaticChallenge {

    public static void main(String[] args) {

        // Step 1: Create Rectangle objects
        Rectangle rect1 = new Rectangle(5, 10);
        Rectangle rect2 = new Rectangle(3, 4);
        Rectangle rect3 = new Rectangle(6, 8);

        // Step 2: Calculate and print area and perimeter of each rectangle
        System.out.println("Rectangle 1 - Area: " + rect1.getArea() + ", Perimeter: " + rect1.getPerimeter());
        System.out.println("Rectangle 2 - Area: " + rect2.getArea() + ", Perimeter: " + rect2.getPerimeter());
        System.out.println("Rectangle 3 - Area: " + rect3.getArea() + ", Perimeter: " + rect3.getPerimeter());

        // Step 3: Print the number of rectangles created
        System.out.println("Number of rectangles created: " + Rectangle.getNumOfRectangles());
    }
}
