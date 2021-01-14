package copyArrayList;

import java.util.ArrayList;

public class MyList {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		
		a.add(12);
		a.add("Max");
		a.add('A');
		a.add(2.5);
		
		ArrayList b=new ArrayList();
		b.addAll(a);
		System.out.println(b);

	}

}
