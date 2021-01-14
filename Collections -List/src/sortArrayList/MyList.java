package sortArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MyList {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
		
		a.add(22);
		a.add(90);
		a.add(75);
		a.add(67);
		a.add(13);
		a.add(44);
		
//		Collections.sort(a);
//		
//		System.out.println(a);
		
		for(int i=0;i<a.size();i++)
		{
			for(int j=i+1;j<a.size();j++)
			{
				if(a.get(i)>a.get(j))
				{
					int temp=a.get(i);
					a.set(i, a.get(j));
					a.set(j, temp);
				}
			}
		}
		System.out.println(a);
		
	}

}
