package JavaBasicPrograms;

public class missingNumberInArray {

	public static void main(String[] args) {
	// 1. Array should not have duplicates
	// 2. No need to be in sorted order
	// 3. Values should be in range (1 to 5)
		
		int[] a = {1,2,4,5};
		//1+2+4+5=12 sum of elements in array == sum1
		//Find sum of all values in range (1 to 5) 1+2+3+4+5 =15 == sum2
		//sum2-sum1
		
		//Find sum1
		int sum1=0;
		for(int i: a) {
			sum1 = i+sum1;
		}
		System.out.println("The sum of all elements in an array is "+sum1);
		
		//Find sum2
		int sum2=0;
		for(int i=1; i<=5; i++) {
			sum2+=i;
		}
		System.out.println("The sume of range of Elements "+sum2);
		
		System.out.println("The missing number in array is: "+(sum2-sum1));
	}

}
