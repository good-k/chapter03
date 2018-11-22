package chapter03;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("one", 1);        // auto boxing
		map.put("two", 2);
		map.put("three", 3);
		
		int i = map.get("two");  // auto unboxing
		System.out.println( i );
		
		map.put("three", 33333);
		
		int j = map.get("three");
		System.out.println(j);
		
		//순회
		Set<String> keySet = map.keySet();
		for(String key : keySet) {
			int value = map.get(key);
			System.out.println(value);
		}
		
	}

}
