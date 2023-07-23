/*
		 * Given a number 'N' print the sum of each digit to the power of number of digits in given input.
						Example :
						Input => 1234
						=> ( 1 ^ 4 ) + ( 2 ^ 4 ) + ( 3 ^ 4 ) + ( 4 ^ 4 )
						=> 1 + 16 + 81 + 256
						Output => 354
						N <=100000000000
						Sample Testcase :
						INPUT
						1234
						OUTPUT
						354
		 */
package JavaBasicPrograms;
import java.util.Scanner;

public class sumofEachDigitToThePowerofNumberofDigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		int n = num;
		int n1=num;
		
		//First find the no. of digits in a number
		int count=0;
		while(n!=0) {
			int rem = n%10;
			count++;
			n = n/10;
		}
		//System.out.println("The no.of digits in a number are: "+count);  // 4 


		int sum =0;
		while(n1 != 0) {
			int rem = n1%10;
			int power=1;
			for(int i=1; i<=count; i++) {
				power = power*rem; 
			}
			sum =sum + power;
			n1 =n1/10;
		}
		System.out.println(sum);

	}

}
