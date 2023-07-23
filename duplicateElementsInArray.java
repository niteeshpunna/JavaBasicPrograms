package JavaBasicPrograms;

import java.util.HashSet;

public class duplicateElementsInArray {

	public static void main(String[] args) {

		String[] arr = {"PUNNA","Niteesh","KUMAR","Java"};
		
//Approach-1: Take arr[0], compare with rest of elements
		/*boolean flag = false;
		int dupIndex1 = 0;
		int dupIndex2 = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.println("Duplicate Element: "+arr[i]);
					flag = true;
					dupIndex1 = i;
					dupIndex2 = j;
					System.out.println("The indices of duplicate elements are "+dupIndex1+" & "+dupIndex2);
				}
			}
		}
		if(flag == false) {
			System.out.println("Duplicate Element Not found");
		}*/
		
		
//Approach-2: Bu using hasSet
		
		HashSet<String> values = new HashSet();
		//HashSet takes only unique values
//		values.add("Niteesh");
//		values.add("Java");
//		values.add("Niteesh");
//		values.add("NITEESH");
//		values.add("Kumar");
		
		//System.out.println(values.add("Niteesh"));//returns boolean value
		boolean flag =false;
		for(String name:arr) {
			//System.out.println(values.add(name));
			//if returning false, there is a duplicate
			if(values.add(name) == false) {
				System.out.println("The Duplicate Element is: "+name);
				flag = true;
			}
		}
		if(flag == false) {
			System.out.println("No duplicate Element");
		}
	}
}
