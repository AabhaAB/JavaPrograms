package JavaPrograms; // declares the package name for the program

import java.util.Scanner; // imports the Scanner class from the java.util package. Scanner class is used to read input from the user.

public class Factorial { // declares a public class named Factorial
	public static void main(String args[]) { // declares a public static method named main that takes an array of Strings as input. The "main" method is the entry point of the program.
		System.out.println("Enter a number"); // Prompts the user to enter a number
		Scanner scanner = new Scanner(System.in); // creates an object of the Scanner class named scanner to read input from the user
		int n = scanner.nextInt(); // reads an integer from the user using the Scanner object and store it in the variable n
		int fact = 1; // initializes an integer variable named fact to 1
		for(int i =1; i<=n; i++) { // starts a for loop that iterates from 1 to n inclusive. The loop variable is named i.
			fact= fact*i; // multiplies the value of fact by i and assigns the result back to fact. This is how the factorial is calculated.
		}
		System.out.println("Factorial of " + n + " is :" +fact); // prints the result of the factorial calculation to the console
		scanner.close(); // closes the Scanner object to release any system resources it was using.
	}
}
