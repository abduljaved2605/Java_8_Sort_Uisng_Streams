
public class CountNumberOfCharacters {
	public static void main(String[] args) {
		
		String nameofWord = "Java";
		double count = nameofWord.chars().filter(ch->ch =='a').count();
		System.out.println("the number of occurance "+ count);
		long count1 =nameofWord.codePoints().filter((ch->ch =="a").count());
	}

}
