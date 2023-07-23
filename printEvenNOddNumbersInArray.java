package JavaBasicPrograms;

public class printEvenNOddNumbersInArray {

	public static void main(String[] args) {

		int[] a = {6,5,4,9,8,7};
		
		/*//Extracting even numbers
		for(int i=0; i<a.length; i++) {
			if(a[i]%2 == 0) {
				System.out.print(a[i]+" "); // prints 6 4 8 
			}
		}
		
		//Extracting Odd numbers
		for(int i=0; i<a.length; i++) {
			if(a[i]%2 != 0) {
				System.out.print(a[i]+" "); //prints 5 9 7 
			}
		}*/
		
		//Enhanced Loop
		for(int i :a) {
			//Extracting even numbers
			if(i%2 == 0) {
				System.out.print(i+" ");
			}
		}
			System.out.println();
			
			//Extracting Odd numbers
			for(int i :a) {
			if(i%2 != 0) {
				System.out.print(i+" ");
				}
			}
		}
	}

