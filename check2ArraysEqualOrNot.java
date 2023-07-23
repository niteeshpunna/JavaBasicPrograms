package JavaBasicPrograms;

import java.util.Arrays;

public class check2ArraysEqualOrNot {

	public static void main(String[] args) {

		int[] a1 = {1,2,3,4,5};
		int[] a2 = {1,2,3,4,5};
		
		/*//Approach-1: By using equals method
		boolean status = Arrays.equals(a1,a2); //import arrays class
		if(status == true) {
			System.out.println("Arrays are Equal");
		}
		else {
			System.out.println("Arrays are Not Equal");
		}*/
		
		//Approach-2: 
		// 1. check length of each array (length should be equal
		//
		boolean status = true;
		//check for equal length. if lengths are not equal else part will be executed
		if(a1.length == a2.length) {
			//compare rest of elements
			for(int i=0; i<a1.length; i++) {
				if(a1[i] != a2[i]) {
					//if both elements not equal status will be changed to false
					status = false;
				}
			}
		}
		//if lengths are not equal else part will be executed
		else {
			status = false;
		}
		if(status == true) {
			System.out.println("Arrays are equal");
		}else {
			System.out.println("Arrays are Not Equal");
		}
	}

}
