/*
		 Given a number N, Print sum of every didgit to the power of the weight of corresponding digit(Explanation : If the input is 12345 and then output calculated as (1^0)+(2^1)+(3^2)+(4^3)+(5^4)).
					Input Size : 1 <= N <= 100000
					Sample Testcase :
					INPUT
					100
					OUTPUT
					1
		 */
package JavaBasicPrograms;
import java.util.Scanner;

public class sumofEachDigitToThePowerofCorrespondingDigit {

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
		int newCount=0;
		while(n1 != 0) {
			int rem = n1%10;
			newCount++;
			int limit = count - newCount;
			int power=1;
			for(int i=1; i<=limit; i++) {
				power = power*rem; 
			}
			sum =sum + power;
			n1 =n1/10;
		}
		System.out.println(sum);

	}

}
