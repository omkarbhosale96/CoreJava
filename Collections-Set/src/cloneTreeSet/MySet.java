package cloneTreeSet;

import java.util.TreeSet;

public class MySet {

	public static void main(String[] args) {
		
		TreeSet<Integer> s=new TreeSet<>();
		s.add(12);
		s.add(32);
		s.add(10);
		s.add(67);
		
		TreeSet<Integer> s1=new TreeSet<>();
		s1=(TreeSet)s.clone();
		
		System.out.println(s1);
	}
}
