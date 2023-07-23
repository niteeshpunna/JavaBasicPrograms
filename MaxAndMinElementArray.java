package JavaBasicPrograms;

public class MaxAndMinElementArray {

	public static void main(String[] args) {
		
		int[] a = {9,8,17,1,2,3};
//Maximum Element in array
		int max = a[0];
		int maxIndex=0;
		for(int i=1; i<a.length; i++) {
			if(a[i]>max) {
				max = a[i];
				maxIndex = i;
			}
		}
		System.out.println("Max Element in Array is "+ max);
		System.out.println("The Max Index is "+maxIndex);
		
//Minimum Element in array
		/*int min = a[0];
		int minIndex = 0;
		for(int i=1; i<a.length; i++) {
			if(a[i]<min) {
				min = a[i];
				minIndex = i;
			}
		}
		System.out.println("Min Element in Array is "+ min);
		System.out.println("The index of min Element is "+minIndex);*/
	}

}
