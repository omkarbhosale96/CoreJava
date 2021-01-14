package sortArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class MyList {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<>();
		
		a.add("mnop");
		a.add("abcd");
		a.add("abce");
		a.add("fgh");
		a.add("bcd");
		
//		Collections.sort(a);
//		System.out.println(a);
		
		for(int i=0;i<a.size();i++)
		{
			for(int j=i+1;j<a.size();j++)
			{
				if(a.get(i).compareTo(a.get(j))>0)
				{
					String temp=a.get(i);
					String temp1=a.get(j);
					a.set(i, temp1);
					a.set(j, temp);
				}
			}
		}
		System.out.println(a);
	}

}
