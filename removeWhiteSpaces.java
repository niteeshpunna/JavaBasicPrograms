package JavaBasicPrograms;

public class removeWhiteSpaces {

	public static void main(String[] args) {
		
		String str = "sum of its first and last digit";
		
		str = str.replaceAll("\\s", "");
		
		System.out.println("After removing spaces, the string is: "+str);

	}

}
