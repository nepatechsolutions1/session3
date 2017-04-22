
public class ForExample {
	public static void main(String[] args) {
		for (int i = 1; i < 11; i=i+2) {
			System.out.println(i);
		}
		
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        for (int item : numbers) {
            System.out.println("number is: " + item);
        }
	}
}
