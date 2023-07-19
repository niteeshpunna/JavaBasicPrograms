package JavaBasicPrograms;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num=n;
		
		int rev =0;
		
		while(num!=0) {
			rev = rev*10 + num%10;
			num = num/10;
		}
		System.out.println(rev);
		
		if(n == rev) {
			System.out.println("The Given number: "+n+" is a Palindrome");
		}
		else {
			System.out.println("The Given number: "+n+" is Not a Palindrome");
		}

	}

}
