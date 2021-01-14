package fistAndLastOccurance;

import java.util.LinkedList;
import java.util.List;

public class MyList {

	public static void main(String[] args) {
		List<Integer> a=new LinkedList<>();
		
		a.add(2);
		a.add(9);
		a.add(7);
		a.add(6);
		a.add(1);
		a.add(4);
		a.add(0);
		a.add(9);
		a.add(7);
		a.add(5);
		a.add(9);
		a.add(3);
		
		int element=9;
		
		System.out.println(a.lastIndexOf(element));
		System.out.println(a.indexOf(element));

	}

}
