package copyMap;

import java.util.HashMap;
import java.util.Map;

public class MyMap {

	public static void main(String[] args) {
		HashMap<Character,Integer> hm=new HashMap<>();
		
		hm.put('A', 44);
		hm.put('B', 20);
		hm.put('C', 67);
		hm.put('D', 12);
		hm.put('E', 95);
		hm.put('F', 52);
		HashMap<Character,Integer> hm1=new HashMap<>();
		
		hm1.putAll(hm);
		for(Map.Entry<Character, Integer> e:hm1.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}

	}

}
