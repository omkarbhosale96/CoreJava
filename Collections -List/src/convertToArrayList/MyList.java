package convertToArrayList;

import java.util.*;

public class MyList {

	public static void main(String[] args) {
		
		LinkedList<Integer> a=new LinkedList<>();	
		a.add(22);
		a.add(90);
		a.add(75);
		a.add(67);
		a.add(13);
		a.add(44);
		
		ArrayList<Integer> b=new ArrayList<>();
		b.addAll(a);
		System.out.println(b);

	}

}
