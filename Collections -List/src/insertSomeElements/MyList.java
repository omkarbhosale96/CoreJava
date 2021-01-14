package insertSomeElements;

import java.util.*;

public class MyList {

	public static void main(String[] args) {
		List<Integer> a=new LinkedList<>();
		a.add(0);
		a.add(0);
		a.add(0);
		a.add(0);
		a.add(0);
		
		a.set(3, 24);
		a.set(2, 69);
		a.set(1, 21);
		a.set(4, 12);
		a.set(0, 10);
		System.out.println(a);

	}

}
