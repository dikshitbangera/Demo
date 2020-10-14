import java.util.HashMap;
import java.util.Map;

public class mapAB4 {

	public Map<String, String> mapAB41(Map<String, String> map) {
	
	
		
		if((map.get("a").length())>(map.get("b").length())) {
			map.put("c", map.get("a"));
			
		}
		else {
			map.put("c", map.get("b"));
		}
	
		
		return map;
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> map=new HashMap<String,String>();
		map.put("a", "aaaa");
		map.put("b", "bbbbbb");
		map.put("c", "cake");
		mapAB4 m=new mapAB4();
		System.out.println(m.mapAB41(map));
	}

}
