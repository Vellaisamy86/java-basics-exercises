package io.javabrains.javabasics;

import java.util.Arrays;
import java.util.OptionalInt;

public class ArrayChallenge {
    public static void main(String[] args) {
        // Step 1: Create an array of integers
        int[] numbers = {10, 20, 30, 40, 50};

        // Step 2: Use arrays and array operations to find the sum, average, and largest number in the array
        int sum = 0;
        int largest = numbers[0];
        for (int number : numbers) {
            sum += number; // Calculate sum
            if (number > largest) { // Find largest number
                largest = number;
            }
        }
        double average = (double) sum / numbers.length; // Calculate average
        // Step 3: Print the results
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Largest Number: " + largest);

        //  Step 4: Using Stream API to find the sum, average, and largest number in the array
        int streamSum = Arrays.stream(numbers).sum();
        double streamAverage = Arrays.stream(numbers).average().orElse(0.0);
        OptionalInt streamLargest = Arrays.stream(numbers).max();

        // Step 5: Print the results from Stream API
        System.out.println("Stream Sum: " + streamSum);
        System.out.println("Stream Average: " + streamAverage);
        if (streamLargest.isPresent()) {
            System.out.println("Stream Largest Number: " + streamLargest.getAsInt());
        } else {
            System.out.println("Stream Largest Number: Not found");
        }
    }
}
