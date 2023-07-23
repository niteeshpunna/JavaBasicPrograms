/* 
 Given a number N, print the sum of the squares of its digits.
			Input Size : 1 <= N <= 1000000000000000000
			Sample Testcase :
			INPUT
			19
			OUTPUT
			82
 */

package JavaBasicPrograms;

public class sumOfSquaresOfDigit {

	public static void main(String[] args) {
		int n=19;
		int sum=0;
		while(n!=0) {
			int rem = n%10;
			sum = sum + (rem*rem);
			n = n/10;
			}
			
		System.out.println(sum);
		}
	}


