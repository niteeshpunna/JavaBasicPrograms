package JavaBasicPrograms;

public class reverseNumber {

	public static void main(String[] args) {

			int num = 123456789;
			
	//Approach-1: using algorithm
			//		int rev=0;
			//		while(num!=0) {
			//			rev = rev*10 + num%10;
			//			num = num/10;
			//		}
			//		System.out.println("Resverse Number is ..."+ rev);
		
	
	//Approach-2: Using StringBuffer class method
			//			StringBuffer rev;
			//			//Convert number into String
			//			StringBuffer sb =new StringBuffer(String.valueOf(num));
			//			rev = sb.reverse();
			//			System.out.println("Resverse Number is ..."+ rev);
			
	
	//Approach-3: Using StringBuilder
			
			//Convert number into String
			StringBuilder sbl =new StringBuilder();
			sbl.append(num);
			StringBuilder rev1 = sbl.reverse();
			
			System.out.println("Resverse Number is ..."+ rev1);
			
	}

}
