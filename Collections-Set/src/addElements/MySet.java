package addElements;

import java.util.*;

public class MySet {

	public static void main(String[] args) {
		Set<Character> s=new TreeSet<>();
		s.add('A');
		s.add('B');
		s.add('C');
		s.add('D');
		s.add('E');
		
		
		Set<Character> s1=new TreeSet<>();
		s1.addAll(s);
		System.out.println(s1);

	}

}
