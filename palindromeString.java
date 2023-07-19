package JavaBasicPrograms;

import java.util.Scanner;

public class palindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		//Create a empty string
		String revName = "";
		// Reverse a String
		for(int i=0; i<name.length(); i++) {
			revName = name.charAt(i) + revName;
		}
		
		//Compare original String with reversed String
		if(name.equals(revName)) {
			System.out.println("The String "+name+" is a Palindrome");
		}else {
			System.out.println("The String "+name+" is Not a Palindrome");
		}
	}

}
