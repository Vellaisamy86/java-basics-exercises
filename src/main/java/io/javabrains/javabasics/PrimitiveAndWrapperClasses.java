package io.javabrains.javabasics;

public class PrimitiveAndWrapperClasses {
    public static void main(String[] args) {
        // Step 1: Declare primitive variables
        int age = 39;
        double profit =13.56;

        // Step 2: Convert primitive variables to wrapper objects
        Integer ageWrapper = age; // Autoboxing
        Double profitWrapper = profit; // Autoboxing

        // Step 3: Print the values of the wrapper objects
        System.out.println("Age Wrapper: " + ageWrapper);
        System.out.println("Profit Wrapper: " + profitWrapper);

        // Step 4: Convert wrapper objects back to primitive variables
        int agePrimitive = ageWrapper; // Unboxing
        double profitPrimitive = profitWrapper; // Unboxing

        // Step 5: Print the values of the primitive variables
        System.out.println("Age Primitive: " + agePrimitive);
        System.out.println("Profit Primitive: " + profitPrimitive);
    }
}
