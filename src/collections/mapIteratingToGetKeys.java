package collections;

import java.util.HashMap;
import java.util.Map;

public class mapIteratingToGetKeys {
   
	public static void main(String[] args) {
		HashMap<Integer,String> hm= new HashMap<>();
		hm.put(1,"apple");
		hm.put(2, "kiwi");
		hm.put(3, "cherry");
		
		for(int i:hm.keySet()) {
			System.out.println(i);
		}
		
		for(Map.Entry<Integer, String> entry: hm.entrySet()) {
			System.out.println(entry.getKey());
		}
		
		hm.forEach((key,value)-> System.out.println(key))
		;
	}
}
