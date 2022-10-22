package tutorial;
import java.util.Scanner;


public class WhileLoop {

	public static void main(String[] args) {
		
		
		int x = 0;
		
		do {
			System.out.println("Type the correct number");
			Scanner sc = new Scanner(System.in);
			x = sc.nextInt();
		} while (x !=10);
		System.out.println("Finished!");
	
	}

}
