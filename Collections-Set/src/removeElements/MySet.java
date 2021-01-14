package removeElements;

import java.util.HashSet;
import java.util.Set;

public class MySet {

	public static void main(String[] args) {
		Set<Integer> s=new HashSet<Integer>();
		s.add(23);
		s.add(45);
		s.add(67);
		s.add(12);
		s.add(78);

		System.out.println(s);
		s.clear();
		System.out.println(s);

	}

}
