package tutorial;

import java.util.Scanner;
public class Scantutorial {

	public static void main(String[] args) {

		Scanner epix = new Scanner(System.in );
		System.out.println("Please enter the first number: ");
		int num1 = epix.nextInt();
		System.out.println("Please enter the second number:");
		int num2 = epix.nextInt();
		System.out.println("Please enter the operator + - * /");
		String operator = epix.next();
		
		int result = 0;
		if (operator.equals("+")) {
			result = num1 + num2;
		} else if (operator.equals("-")) {
			result = num1 - num2;
		} else if (operator.equals("*") ) {
			result = num1 * num2;
		} else if (operator.equals("/")) {
			result = num1 / num2;
		}
	
		System.out.println(num1 + operator + num2 + " = " + result);
		epix.close();
	}

}
