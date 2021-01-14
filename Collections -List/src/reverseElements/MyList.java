package reverseElements;

import java.util.ArrayList;
import java.util.Collections;

public class MyList {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
		
		a.add(22);
		a.add(90);
		a.add(75);
		a.add(67);
		a.add(13);
		a.add(44);
		System.out.println(a);
		Collections.reverse(a);
		System.out.println(a);
	}

}
