package io.javabrains.javabasics;

import java.util.ArrayList;
import java.util.List;

public class Operators {
    public static void main(String[] args) {
        // Step 1: Declare variables
        int a = 10;
        int b = 5;

        // Step 2: Perform arithmetic operations
        int sum = a + b;          // Addition

        // Step 3: Print the results of the arithmetic operations
        System.out.println("sum = " + sum);

        // Step 4: Perform increment and decrement operations
        a++; // Increment a by 1
        b--; // Decrement b by 1


        // Step 5: Print the results of the increment and decrement operations
        System.out.println("After incrementing a:"+a+" and decrementing b:"+b);

        // Step 6: Perform comparison operations
        boolean isEqual = (a == b);      // Check if a is equal to b

        // Step 7: Print the results of the comparison operations
        System.out.println("Is a equal to b? " + isEqual);

        // Step 8: Perform logical operations
        boolean isAGreaterThan = (a > b);    // Check if a is greater than b

        // Step 9: Print the results of the logical operations
        System.out.println("Is a greater than b? " + isAGreaterThan);

    }
}
