
/*
 * Write a program to count number of digit before and after the dot in a float.
 * Example: 178.34 - number before dot: 3 number after dot: 2
 */
public class StringExamples2 {
	public static void main(String[] args) {
		float number = 123.567f;
		String numberStr = Float.toString(number);
		
		int dotPosition = numberStr.indexOf('.');
	
		int secondPart = numberStr.length() - dotPosition - 1;

		
		System.out.println("Number of chars before dot: " + dotPosition);
		System.out.println("Number of chars after dot: " + secondPart);
		
		
		String name = "ram prashad";
		System.out.println(name.substring(0, 3));
		
	}
}
