package firstAndLastElement;

import java.util.TreeSet;

public class MySet {

	public static void main(String[] args) {
		TreeSet<Integer> s=new TreeSet<>();
		s.add(12);
		s.add(32);
		s.add(10);
		s.add(67);
		System.out.println(s.first());
		System.out.println(s.last());
		
		

	}

}
