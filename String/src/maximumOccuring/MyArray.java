package maximumOccuring;

import java.util.HashMap;
import java.util.Map;

public class MyArray {

	public static void main(String[] args) {
		
		String s="aabbbaaacccc";
		
		HashMap<Character, Integer> hm=new HashMap<>();
		
		for(int i=0;i<s.length();i++)
		{
			if(hm.containsKey(s.charAt(i)))
			hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
			else 
				hm.put(s.charAt(i), 1);
		}
		int maxIndex=0;
		char max=' ';
		int maxIndex2=0;
		char max2=' ';
		for(Map.Entry<Character, Integer> hm1: hm.entrySet())
		{
			
			System.out.println(hm1);
			if(maxIndex<hm1.getValue())
			{
				maxIndex2=maxIndex;
				max2=max;
				maxIndex=hm1.getValue();
				max=hm1.getKey();
			}
			else if(maxIndex2<hm1.getValue() && maxIndex!=hm1.getValue())
			{
				maxIndex2=hm1.getValue();
				max2=hm1.getKey();
			}
		}
		System.out.println("The maximum occuring character is "+max);
		System.out.println("Second most occuring character is "+max2);
	}

}
