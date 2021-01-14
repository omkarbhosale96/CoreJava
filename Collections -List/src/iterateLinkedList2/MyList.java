package iterateLinkedList2;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class MyList {

	public static void main(String[] args) {
		List<Integer> a=new LinkedList<>();
		
		a.add(22);
		a.add(90);
		a.add(75);
		a.add(67);
		a.add(13);
		a.add(44);
		int index=2;
		ListIterator<Integer> it=a.listIterator(index);
		
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}

	}

}
