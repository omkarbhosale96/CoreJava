package hashSetToArrayList;
import java.util.*;
public class MySet {

	public static void main(String[] args) {
		HashSet<Integer> h=new HashSet<>();
		h.add(48);
		h.add(12);
		h.add(35);
		h.add(72);
		h.add(20);
		
		ArrayList<Integer> a=new ArrayList<>();
		
		a.addAll(h);
		
		System.out.println(a);
	}

}
