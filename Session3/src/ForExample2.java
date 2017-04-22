import java.util.Scanner;

public class ForExample2 {
	
	public static void main(String[] args) {
		
		System.out.print("Please input your name: ");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();

		String[] subjects = {"Science", "Math", "Environment", "History", "Population", "Moral Science", "English", "Nepali"};
		
		int totalScore = 0;
		boolean isFailed = false;
		
		System.out.println("Hi " + name + "!! Welcome to marksheet app.");
		for (int i = 0; i < 8; i++) {
			System.out.print("Enter score in subject: " + subjects[i]);
			int score = input.nextInt();
			
			if (score < 32) {
				System.out.println("you failed " + subjects[i]);
				isFailed = true;
			}
			
			totalScore = totalScore + score;
		}
		
		float percent = (totalScore / 800.0f) * 100f;
		
		if (!isFailed) {
			if (percent < 50.f) {
				System.out.println("YOU RECEIVED GRADE F, PLEASE TRY HARD TO PASS NEXT TIME");
			} else if (percent >= 50 && percent < 70) {
				System.out.println("YOU RECEIVED GRADE C, YOU CAN DO BETTER");
			} else if (percent >= 70 && percent < 90) {
				System.out.println("YOU RECEIVED GRADE B, GRADE A IS IN THE HORIZON");
			} else {
				System.out.println("YOU RECEIVED GRADE A, EXCELLENT WORK");
			}
		} else {
			System.out.println("YOU RECEIVED GRADE F, PLEASE TRY HARD TO PASS NEXT TIME");
		}
		
		input.close();
	}

}
