package addAtFirstAndLast;

import java.util.LinkedList;
import java.util.List;

public class MyList {

	public static void main(String[] args) {
		List<Integer> a=new LinkedList<>();
		
		a.add(22);
		a.add(90);
		a.add(75);
		a.add(67);
		a.add(13);
		a.add(44);
		System.out.println(a);
		
		a.add(0, 0);
		a.add(0);
		System.out.println(a);

	}

}
