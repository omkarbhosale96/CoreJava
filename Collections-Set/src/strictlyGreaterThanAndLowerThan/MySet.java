package strictlyGreaterThanAndLowerThan;
import java.util.*;
public class MySet {

	public static void main(String[] args) {
		
		TreeSet<Integer> t=new TreeSet<>();
		t.add(8);
		t.add(12);
		t.add(20);
		t.add(5);
		t.add(7);
		t.add(14);
		t.add(22);
		
		
		System.out.println(t.higher(10));
		System.out.println(t.lower(10));
	}
}
