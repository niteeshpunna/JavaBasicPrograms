package JavaBasicPrograms;

public class sumOfOddDigitsInaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=32224;
		int sum=0;
		while(n!=0) {
			int rem = n%10;
			if(rem%2 !=0) {
				sum+=rem;
			}
			n = n/10;
		}
		
		if(sum%2 != 0) {
			System.out.println("O");
		}else {
			System.out.println("E");
		}
	}

}
