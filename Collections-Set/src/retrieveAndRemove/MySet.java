package retrieveAndRemove;
import java.util.*;
public class MySet {

	public static void main(String[] args) {
		TreeSet<Integer> s=new TreeSet<>();
		
		s.add(67);
		s.add(15);
		s.add(22);
		s.add(40);
		s.add(97);
		
		int b=s.pollFirst();
		System.out.println(b);
		System.out.println(s);
		
	}

}
