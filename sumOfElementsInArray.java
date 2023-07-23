package JavaBasicPrograms;

public class sumOfElementsInArray {

	public static void main(String[] args) {
		
		
		int a[] = {3,9,5,8,5,1,6,6};
		int sum = 0;
		/*// Approach-1: By using for loop
		for(int i=0; i<a.length; i++) {
			sum = sum +a[i];
		}
		
		System.out.println(sum);*/
		
		
		//Approach-2: By using Enhanced for loop
		//No need to specify any initialization, condition, increment
		
		for(int value:a) {
			sum = sum+ value;
		}
		System.out.println(sum);
	}

}
