package HashSetToTreeSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MySet {

	public static void main(String[] args) {
		Set<Integer> s=new HashSet<Integer>();
		s.add(23);
		s.add(45);
		s.add(67);
		s.add(12);
		s.add(78);
		
		Set<Integer> t=new TreeSet<>();
		t.addAll(s);
		
		System.out.println(s);
		System.out.println(t);

	}

}
