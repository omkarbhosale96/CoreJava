package compareLinkedLists;

import java.util.LinkedList;

public class MyList {

	public static void main(String[] args) {
		LinkedList<Integer> a=new LinkedList<>();	
		a.add(22);
		a.add(90);
		a.add(75);
		a.add(67);
		a.add(13);
		a.add(44);
		
		LinkedList<Integer> b=new LinkedList<>();	
		b.add(22);
		b.add(90);
		b.add(75);
		b.add(67);
		b.add(13);
		b.add(44);
		
		
		System.out.println(a.equals(b));

	}

}
