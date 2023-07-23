package JavaBasicPrograms;

public class sumofFirstAndLastDigit {

	public static void main(String[] args) {

		int num=32224;
		// Find the no.of digits
		int n = num;
		int count =0;
		while(n!=0) {
			int rem = n%10;
			count++;
			n = n/10;
		}
		
		//find sum of first digit & last digit
		int n1=num;
		int[] a= new int[count];
			
		for(int i=count-1; i>=0; i--) {
				int rem = n1%10;
				n1 = n1/10;
				a[i] = rem;
			}
		System.out.println(a[0]+a[count-1]);
	}
}
