package hashmapex;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BasicExample {
	
	public static void main(String[] args) {
		Map <String,String> nameMap = new HashMap<>();
		nameMap.put("chennai", "TN");
		nameMap.put("Trichur", "KL");
		nameMap.put("Nellore", "AP");
		
		
		
		Set<Map.Entry<String, String>> values = nameMap.entrySet();
		values.forEach( e-> {
			System.err.println("key:"+e.getKey()+"  value:-"+e.getValue());
		});
		
	}

}
