import java.util.HashMap;
import java.util.Map;

public class mapBully {

	
	public Map<String, String> mapBully1(Map<String, String> map) {
		if(map.containsKey("a")) {
			if(map.containsKey("b")) {
				map.replace("b", map.get("a"));
				map.replace("a", "");
				
			}
			else {
				map.put("b", map.get("a"));
				map.replace("a", "");
			}
		}
		
		return map;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,String> map=new HashMap<String,String>();
		map.put("a","candy");
		map.put("b","snickers");
		map.put("c","m&m");
		mapBully b=new mapBully();
		
		System.out.println(b.mapBully1(map));
		
	}

}
