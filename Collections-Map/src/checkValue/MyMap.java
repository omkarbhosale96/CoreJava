package checkValue;

import java.util.HashMap;

public class MyMap {

	public static void main(String[] args) {
		HashMap<Character,Integer> hm=new HashMap<>();
		
		hm.put('A', 44);
		hm.put('B', 20);
		hm.put('C', 67);
		hm.put('D', 12);
		hm.put('E', 95);
		hm.put('F', 52);
		
		System.out.println(hm.containsValue(12));

	}

}
