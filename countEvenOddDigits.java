package JavaBasicPrograms;

public class countEvenOddDigits {

	public static void main(String[] args) {

			int n = 123456789;
			int evenCount =0;
			int oddCount=0;
			
			//Extract the last number & check for even or odd
			while(n!=0) {
				int rem = n%10;
				if(rem%2 == 0) {
					evenCount++;
				}
				else {
					oddCount++;
				}
				n = n/10;
			}
			
			System.out.println("The no. of Even digits: "+evenCount);
			System.out.println("The no. of Odd digits: "+oddCount);
	}

}
