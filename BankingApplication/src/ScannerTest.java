import java.util.Scanner;

public class ScannerTest {
	
	public static void main(String args[]) {
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int value = scanner.nextInt();
		
		System.out.println("Value is "+ value);
		
		System.out.println("Enter a character");
		
		char charAt = scanner.next().charAt(0);
		
		System.out.println("Character is "+ charAt);
		
		System.out.println("Program finished and pushed to github");
		
		
		
		
	}

}
