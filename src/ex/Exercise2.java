package ex;

import java.util.Scanner;
public class Exercise2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in );
		System.out.println("Enter a number: ");
		int num1 = scanner.nextInt();
		System.out.println("Enter the second number:");
		int num2 = scanner.nextInt();

		int result =  num1 + num2;
		scanner.close();
		System.out.println("Here is the result: " + num1 + "+" + num2 + "=" + result);

	}


}