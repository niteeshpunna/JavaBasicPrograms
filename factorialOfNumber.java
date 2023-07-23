package JavaBasicPrograms;

public class factorialOfNumber {

	public static void main(String[] args) {
		
		// Approach by using for loop
		int num = 5;
		long fact=1;
		
		/*//incerasing order of for loop
		for(int i=1; i<=num; i++) {
			fact = fact*i;
		}*/
		
		
		/*//decreasing order of for loop
		for(int i= num; i>0; i--) {
			fact = fact*i;
		}*/
		System.out.println("The factorial of a number "+num+" is: "+fact);

		//Approach-2: By using while loop
		while(num!=0) {
			fact = num* fact;
			num--;
			
		}
		System.out.println("The factorial of a number is: "+fact);
		
	}

}
