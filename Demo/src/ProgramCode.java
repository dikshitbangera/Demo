import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ProgramCode {
	

	public static void main(String[] args) {
		String str="Dikshitt";
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		char[] ch=str.toLowerCase().toCharArray();
		System.out.println(ch);
		for(Character c:ch) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
			
		}
		Set<Character> s=map.keySet();
		for(Character sh: s) {
			if(map.get(sh)>1) {
				System.out.println("The Character "+sh+" repeated "+map.get(sh));
			}
			else {
				System.out.println("The Character "+sh+" repeated "+map.get(sh));
			}
		}
	}

}

