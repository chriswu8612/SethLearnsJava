package tutorial;
import java.util.Scanner;

public class NestedStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Input your age: ");
		Scanner ooferson = new Scanner (System.in);
		String eatme = ooferson.nextLine();
		int age = Integer.parseInt(eatme);
		
		if (age >= 18) {
			System.out.print("What is your favorite food type?");
			String food = ooferson.nextLine();
		
			if (food.equals("Burger")) {
				System.out.println("Same here");
			}
			else
			{
				System.out.println("You are so weird You are not healthy Lol");
			}	
		}
		
		else if (age <= 13) {
			System.out.println("You are too young!");
		}
		else {
			System.out.println("You are a goo goo ga ga");
		}
	}

}
