package compareTwoHashSet;

import java.util.Arrays;
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
		Set<Integer> s1=new HashSet<Integer>();
		s1.add(23);
		s1.add(45);
		s1.add(67);
		s1.add(12);
		s1.add(78);
		
		System.out.println(s.equals(s1));
		
		

	}

}
