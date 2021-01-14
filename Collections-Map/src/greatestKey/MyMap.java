package greatestKey;

import java.util.TreeMap;

public class MyMap {

	public static void main(String[] args) {
TreeMap<Character,Integer> hm=new TreeMap<>();
		
		hm.put('B', 44);
		hm.put('A', 20);
		hm.put('C', 67);
		hm.put('D', 12);
		hm.put('E', 95);
		hm.put('F', 52);
		
		System.out.println(hm.floorKey('G'));

	}

}
