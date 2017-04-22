import java.util.Scanner;

public class VoterCheck {

	public static void main(String[] args) {
		
		System.out.print("Please enter your age: ");
		Scanner input = new Scanner(System.in);
		int age = input.nextInt();
		
		if (age >= 18) {
			System.out.println("You are elligible to vote");
		} else {
			System.out.println("You are not elligible to vote. Go home!!");
		}
		
		input.close();
		
	}

}
