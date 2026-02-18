import java.util.*;

public class TakeUserInputUsingScanner {
	
	public static void main(String args[]) {
		
		// Take user input from console
		// .nextInt()
		// .nextFloat()
		// .nextDouble()
		// .nextLong
		// .nextLine()
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name.");
		String name = sc.nextLine();
		System.out.println("Your name is "+name+".");
	}
}
