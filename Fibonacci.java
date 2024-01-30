package JavaPrograms;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Limit");
		int lim = sc.nextInt();
		sc.close();
		int a =0, b =1;
		while(a <= lim) {
			System.out.print(a);
			int temp = a+b;
			a = b;
			b = temp;
		}
	}

}
