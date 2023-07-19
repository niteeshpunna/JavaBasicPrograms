package JavaBasicPrograms;

public class checkPrimeNumber {

	public static void main(String[] args) {
			int num =27;
			int count=0;
			if(num>1) {
				for(int i=2; i<num; i++) {
					if(num%i == 0)
						count++;
				}
				
				
				if(count == 0) {
					System.out.println("The number is a Prime Number");
				}else {
					System.out.println("The number is Not a Prime Number");
				}
			}
			else {
				System.out.println("Enter Valid Number");
			}
	}

}
