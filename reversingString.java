package JavaBasicPrograms;

public class reversingString {

	public static void main(String[] args) {

		String name = "Niteesh Kumar";
		
		String revName = ""; //Creating empty string to store reverse chars
		
	//Approach-1: Straight Iteration of each char with concatenation
			for(int i=0; i<name.length();i++) {
				revName = name.charAt(i) + revName;// 
			}
			System.out.println(revName);
		
	//Approach-2: reverse Iteration of each char with concatenation
			for(int i=name.length()-1; i>=0; i--) {
				revName = revName + name.charAt(i);
			}
			System.out.println(revName);
		
	//Approach-3: Using char Array
			char[] ch = name.toCharArray();
			for(int i= ch.length-1; i>=0; i--) {
				revName = revName + ch[i];
			}
			System.out.println(revName);
		
	//Approach-4: using String Builder
			StringBuffer sb = new StringBuffer(name);
			System.out.println(sb.reverse());
	}
}
