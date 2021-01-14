package insertAtLast;
import java.util.*;
public class MyList {

	public static void main(String[] args) {

		List<Integer> a=new LinkedList<>();
		
		a.add(10);
		a.add(55);
		a.add(24);
		a.add(78);
		a.add(60);
		a.add(93);
		
		System.out.println(a);
		int b=12;
		a.add(b);
		System.out.println(a);
		
	}

}
