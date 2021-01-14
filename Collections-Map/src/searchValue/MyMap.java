package searchValue;

import java.util.HashMap;
import java.util.*;;

public class MyMap {

	public static void main(String[] args) {
		TreeMap<Character,Integer> hm=new TreeMap<>();
		
		hm.put('A', 44);
		hm.put('B', 20);
		hm.put('C', 67);
		hm.put('D', 12);
		hm.put('E', 95);
		hm.put('F', 52);
		
		System.out.println(hm.containsValue(20));

	}

}
