package tutorial;
import java.util.Scanner;
public class Ifelse {
	public static void main(String[] args) {
		System.out.print("Type In a name: ");
		Scanner ooferson = new Scanner(System.in);
		String s = ooferson.nextLine();
		
		if (s.equalsIgnoreCase("chris")) {
		 System.out.println("Hello i fart alot and go on the toilet");
		}
		else if (s.equals("Melissa")) {
			System.out.println("Hello i am seths mom and i watch ipad alot");
			
	
		} else {
			System.out.println("Oh hi. Wait a minute, who are you.?");
		}
		
		
	}
	
}
