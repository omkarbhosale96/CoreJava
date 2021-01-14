package cloneLinkedList;

import java.util.LinkedList;
import java.util.List;

public class MyList {

	public static void main(String[] args) {
		LinkedList<Integer> a=new LinkedList<>();	
		a.add(22);
		a.add(90);
		a.add(75);
		a.add(67);
		a.add(13);
		a.add(44);
		List<Integer> b=new LinkedList<Integer>();
		b=(LinkedList)a.clone();
		
		System.out.println(b);

	}

}
