package insertElement;

import java.util.ArrayList;

public class MyList {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
		
		a.add(23);
		a.add(70);
		a.add(10);
		a.add(45);
		a.add(88);
		a.add(12);
		
		a.add(0, 98);
		
		System.out.println(a);
		

	}

}
