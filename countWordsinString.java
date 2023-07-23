package JavaBasicPrograms;

import java.util.Scanner;

public class countWordsinString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int count =1;
		
//To count no.of words (read each char, wherever space is there word end & new word starts
		for(int i=0; i<s.length(); i++) {
		if(s.charAt(i)==' ' && s.charAt(i+1) != ' ') //i+1 should be a character
		{
			count++;
		}
		}
		System.out.println("The no.of words in a string are: "+count);
	}
}
