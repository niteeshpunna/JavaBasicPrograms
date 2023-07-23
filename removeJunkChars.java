package JavaBasicPrograms;

public class removeJunkChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "nabkdb a@$$ &^&  *^*^b  asd h1235464";
		
		//Remove Special chars in String 
		word = word.replaceAll("[^0-9]",""); // use ^ to fetch the data
		System.out.println(word);
		
		
		//To remove White Spaces
		
	}
}
