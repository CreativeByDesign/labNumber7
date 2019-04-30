import java.util.Scanner;
import java.util.regex.Pattern;

public class validator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		 
		System.out.println("Please enter your First and Last Name: ");
		String name = scan.nextLine();

		while (Pattern.matches("(^[A-Z])\\w+\\s\\S\\w+", name)){
			System.out.print(name);
		}
		System.out.println("Please checked the name you entered.");
		
		
		
		
		scan.close();
	}


}
