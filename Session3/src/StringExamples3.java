
// Write a program to isolate different parts of a file path.
public class StringExamples3 {
	public static void main(String[] args) {
		
		String fullPath = "home/user/index.txt";
		
		int lastSlashIndex = fullPath.lastIndexOf('/');
		
		String path = fullPath.substring(0, lastSlashIndex);
		
		String fullFile = fullPath.substring(lastSlashIndex + 1, fullPath.length());
		
		System.out.println("Path: " + path);
		
		int indexOfDot = fullFile.indexOf('.');
		
		String fileName = fullFile.substring(0, indexOfDot);
		String extention = fullFile.substring(indexOfDot + 1, fullFile.length());
		
		
		System.out.println("File name: " + fileName);
		System.out.println("Extension: " + extention);

	}

}
