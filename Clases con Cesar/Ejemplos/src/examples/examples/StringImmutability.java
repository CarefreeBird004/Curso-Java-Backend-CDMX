package examples.examples;

/**
 * This example demostrate the string immutability
 **/
public class StringImmutability {
	
	public static void main(String[] args) {
		// Instance the strings
		String s1 = "Hello";
		String s2 = s1.concat(" world");
		String s3 = s2.toUpperCase();
		
		// Prints each string value
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
		System.out.println("s3: " + s3);
	}
}