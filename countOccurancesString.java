package JavaBasicPrograms;

public class countOccurancesString {

	public static void main(String[] args) {

		String s = "Java Programming Java OOPS";
		
// Check how many times a char is repeatng
		
		//Find total length of string 
		s.length();
		
		//Find length after removing specific char (a)
		s.replaceAll("a","");
		
		System.out.println(s.length() - s.replaceAll("a","").length());
	}

}
