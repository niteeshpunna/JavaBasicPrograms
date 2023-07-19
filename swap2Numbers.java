package JavaBasicPrograms;

public class swap2Numbers {

	public static void main(String[] args) {

		int a=10, b=20;
		System.out.println("Before swapping 2 number are.."+a+" "+ b);
		
		
		//Logic-1: By using temp variable
//		int t=a;
//		a=b;
//		b=t;
//		System.out.println("After swapping 2 number are.."+a+" "+ b); // After swapping 2 number are..20 10
		
		
		//Logic-2: by using addition & Substraction without using third variable
//			a= a+b; // 10+20 =30
//			b= a-b; // 30-20 = 10
//			a= a-b; //30-10 =20
//			System.out.println("After swapping 2 number are.."+a+" "+ b);
			
		
		//Logic-3: By using multiplication & Division without using third variable
			// a & b values should not be zero
//			a= a*b; //10*20 =200
//			b=a/b; // 200/20 = 10
//			a= a/b; //200/10 =20
//			System.out.println("After swapping 2 number are.."+a+" "+ b);
			
			
		//Logic-4: bitwise XOR operators (^)
//			a = a^b; //10^20 = 30
//			b = a^b; //30 ^20 =10
//			a = a^b; //30^10 = 20
//			System.out.println("After swapping 2 number are.."+a+" "+ b);
		
			
		//Logic-5: Single statement
			b = a+b - (a=b); // execution will happen from rightside
			//  10+20 - a=20
			System.out.println("After swapping 2 number are.."+a+" "+ b);
			
	}

}
