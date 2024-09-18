package org.example;
import java.util.Scanner;

    public class ArrayMethodDemo {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int[] numbers = new int[10];

            // Prompt the user to enter 10 integers
            System.out.println("Please enter 10 integers:");
            for (int i = 0; i < numbers.length; i++) {
                System.out.print("Enter integer " + (i + 1) + ": ");
                numbers[i] = input.nextInt();
            }

            // Call the methods to perform the required operations
            displayIntegers(numbers);
            displayIntegersInReverse(numbers);
            displaySum(numbers);
            displayValuesLessThan12(numbers);
            displayValuesHigherThanAverage(numbers);

            input.close();
        }

        // Method to display all the integers
        public static void displayIntegers(int[] numbers) {
            System.out.println("\nAll integers:");
            for (int num : numbers) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        // Method to display all the integers in reverse order
        public static void displayIntegersInReverse(int[] numbers) {
            System.out.println("\nIntegers in reverse order:");
            for (int i = numbers.length - 1; i >= 0; i--) {
                System.out.print(numbers[i] + " ");
            }
            System.out.println();
        }

        // Method to display the sum of the integers
        public static void displaySum(int[] numbers) {
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            System.out.println("\nSum of integers: " + sum);
        }

        // Method to display values less than 12
        public static void displayValuesLessThan12(int[] numbers) {
            System.out.println("\nValues less than 12:");
            boolean found = false;
            for (int num : numbers) {
                if (num < 12) {
                    System.out.print(num + " ");
                    found = true;
                }
            }
            if (!found) {
                System.out.println("No values less than 12.");
            } else {
                System.out.println();
            }
        }

        // Method to display values higher than the average
        public static void displayValuesHigherThanAverage(int[] numbers) {
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            double average = sum / (double) numbers.length;
            System.out.println("\nAverage value: " + average);
            System.out.println("Values higher than the average:");
            boolean found = false;
            for (int num : numbers) {
                if (num > average) {
                    System.out.print(num + " ");
                    found = true;
                }
            }
            if (!found) {
                System.out.println("No values higher than the average.");
            } else {
                System.out.println();
            }
        }
    }


