package io.javabrains.javabasics;

public class JavaVariables {

    public static void main(String[] args) {
        // Step 1: Declare and initialize variables of different data types
        // int variable to store an integer value
        int age=39;

        // long variable to store a long value
        long population=6000000L;

        // short variable to store a short value
        short year=2025;

        // byte variable to store a byte value
        byte level=127;

        // float variable to store a floating-point value
        float profit=14.51345f;

        // double variable to store a double value
        double pi=3.14159;

        // char variable to store a single character
        char initial='V';

        // boolean variable to store a boolean value
        boolean isJavaFun=true;

        // String variable to store a string of characters
        String greeting="Hello, World!";
        System.out.println("Greeting: " + greeting);

        // Step 2: Print the values of the variables to the console
        System.out.println("Age: " + age);
        System.out.println("Population: " + population);
        System.out.println("Year: " + year);
        System.out.println("Level: " + level);
        System.out.println("Profit: " + profit);
        System.out.println("Pi: " + pi);
        System.out.println("Initial: " + initial);
        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Greeting: " + greeting);

        // Step 3: Modify the values of the variables and print the updated values
        age += 1; // Increment age by 1
        population += 100000; // Increase population by 100,000
        year += 1; // Increment year by 1
        level -= 1; // Decrease level by 1
        profit *= 1.1; // Increase profit by 10%
        pi += 0.00001; // Slightly increase pi
        initial = 'T'; // Change initial to 'T'
        isJavaFun = false; // Change boolean value

        // Print updated values
        System.out.println("\nUpdated Values:");
        System.out.println("Updated Age: " + age);
        System.out.println("Updated Population: " + population);
        System.out.println("Updated Year: " + year);
        System.out.println("Updated Level: " + level);
        System.out.println("Updated Profit: " + profit);
        System.out.println("Updated Pi: " + pi);
        System.out.println("Updated Initial: " + initial);
        System.out.println("Is Java fun now? " + isJavaFun);

    }
}
