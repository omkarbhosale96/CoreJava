package retrieveAndRemoveLast;

import java.util.TreeSet;

public class MySet {

	public static void main(String[] args) {
		TreeSet<Integer> s=new TreeSet<>();
		
		s.add(67);
		s.add(15);
		s.add(22);
		s.add(40);
		s.add(97);
		
		int b=s.pollLast();
		System.out.println(b);
		System.out.println(s);

	}

}
