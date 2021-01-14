package iterateArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class MyList {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
		a.add(45);
		a.add(12);
		a.add(20);
		a.add(32);
		a.add(72);
		a.add(85);
		
		Iterator<Integer> it=a.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
