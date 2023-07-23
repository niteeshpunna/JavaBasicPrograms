package JavaBasicPrograms;

public class LinearSearchInArray {

	public static void main(String[] args) {

		int[] a = {10,20,60,60,70};
		
		//Check 30 is present or not
		int element = 50;
		boolean flag = false;
		for(int i=0; i<a.length; i++) {
			if(a[i] == element) {
				System.out.println("Element Found at index "+i);
				flag = true;
				break;
			}
		}
		if(flag == false) {
			System.out.println("Element Not found");
		}
	}
}
