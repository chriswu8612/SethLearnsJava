package tutorial;
import java.util.Scanner;



public class Loops {
	

	
	public static void main(String[] args) {
		
		String[] names = new String[5];
		Scanner bruh = new Scanner(System.in);
		
		
		for (int i =0; i < names.length; i++) {
			System.out.print("Input " + i + ":");
			String input = bruh.nextLine();
			names[i] = input;
		
		}
		for (String n:names) {
			System.out.println(n);
			if (n.equals("jacob")) {
				break;
			}
		
		
		
		}
	
		
		
		
	}

}
