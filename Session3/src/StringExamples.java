import java.util.Scanner;

public class StringExamples {

	public static void main(String[] args) {
		
		String hello = "hello";
		String world = "world";
		
		String helloWorld = hello + world;
		System.out.println(helloWorld);
		
		System.out.println(helloWorld.charAt(4));
		
		String helloWorld2 = hello.concat(world);
		System.out.println(helloWorld2);
		
		System.out.println(hello.length());
		
		System.out.println("Please enter name: ");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		
		if (name.isEmpty()) {
			System.out.println("Name cannot be empty");
		} else if (name.length() <= 2) {
			System.out.println("Please enter your full name");
		} 
	}

}
