package JavaPrograms;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        // Create a new Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number to check for prime
        System.out.print("Enter a number: ");

        // Read the user's input as an integer
        int number = scanner.nextInt();

        // Close the Scanner to prevent resource leaks
        scanner.close();

        // Call the isPrime() method to check if the input number is prime
        if (isPrime(number)) {
            System.out.println(number + " is prime.");
        } else {
            System.out.println(number + " is not prime.");
        }
    }

    public static boolean isPrime(int number) {
        // Check if the input number is less than or equal to 1
        if (number <= 1) {
            // If it is, return false (1 is not prime)
            return false;
        }

        // Loop through all possible factors of the number from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            // If the number is divisible by any factor, it is not prime
            if (number % i == 0) {
                return false;
            }
        }

        // If the number is not divisible by any factors other than 1 and itself, it is prime
        return true;
    }
}
