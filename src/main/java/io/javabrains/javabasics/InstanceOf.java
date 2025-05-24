package io.javabrains.javabasics;

public class InstanceOf {

    public static void main(String[] args) {

        Object[] objects = {
                10,
                "Hello",
                true,
                20.5
        };

        // Challenge: Use instanceof to determine the type of each object in the array
        for (Object obj : objects) {
            if (obj instanceof Integer) {
                System.out.println(obj + " is an Integer");
            } else if (obj instanceof String) {
                System.out.println(obj + " is a String");
            } else if (obj instanceof Boolean) {
                System.out.println(obj + " is a Boolean");
            } else if (obj instanceof Double) {
                System.out.println(obj + " is a Double");
            } else {
                System.out.println(obj + " is of unknown type");
            }
        }
        /*for(Object obj : objects) {
            switch (obj) {
                case Integer i -> System.out.println(i + " is an Integer");
                case String s -> System.out.println(s + " is a String");
                case Boolean b -> System.out.println(b + " is a Boolean");
                case Double d -> System.out.println(d + " is a Double");
                case null -> System.out.println("null is of unknown type");
                default -> System.out.println(obj + " is of unknown type");
            }
        }*/
    }
}

