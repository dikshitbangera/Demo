import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String s1="Keep a boo";
		String s2="Peek boo a";
		
		String word1=s1.replaceAll("\\s","");
		String word2=s2.replaceAll("\\s","");
		if(word1.length()!=word2.length()) {
			System.out.println("The words are not anagram");
		}
		else {
			char[] char1=word1.toLowerCase().toCharArray();
			char[] char2=word2.toLowerCase().toCharArray();
			Arrays.sort(char1);
			System.out.println(char1);
			Arrays.sort(char2);
			System.out.println(char2);
			if(Arrays.equals(char1, char2)) {
				System.out.println("The words are anagram");
			}
			else {
				System.out.println("The words are not anagram");
			}
		}
	
	}

}