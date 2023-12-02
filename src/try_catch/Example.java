package try_catch;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        // Create a List of integers
        List<Integer> numbers = new ArrayList<>();

        // Adding elements to the List
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Accessing an element that may cause an IndexOutOfBoundsException
        try {
            int value = numbers.get(3); // Try to get value at index 3
            System.out.println("Value at index 3: " + value);
        } catch (IndexOutOfBoundsException e) {
            // Handle the exception if index is out of bounds
            System.err.println("IndexOutOfBoundsException: " + e.getMessage());
        }

        // Accessing an element that may cause an ArithmeticException
        try {
            int result = divideByZero(); // Try to perform division
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            // Handle the exception if division by zero occurs
            System.err.println("ArithmeticException: " + e.getMessage());
        }
    }

    // A method that may cause an ArithmeticException
    private static int divideByZero() {
        int numerator = 10;
        int denominator = 0;
        return numerator / denominator; // Potential division by zero
    }
}