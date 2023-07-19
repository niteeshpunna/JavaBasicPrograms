package JavaBasicPrograms;

public class largestOf3Numbers {

	public static void main(String[] args) {
		
		
		//Approach-1
		//if a>b & a>c -----> a is largest
		int a=10, b=30, c=30;
		
		if(a>b && a>c) {
			System.out.println("The Largest Number is "+a);
		}
		else if(b>a && b>c) {
			System.out.println("The Largest Number is "+b);
		}
		else {
			System.out.println("The Largest Number is "+c);
		}
		
		//Approach-2: By using ternary operator

	}

}
