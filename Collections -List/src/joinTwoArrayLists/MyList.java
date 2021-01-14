package joinTwoArrayLists;

import java.util.ArrayList;

public class MyList {

	public static void main(String[] args) {
		ArrayList a=new ArrayList<>();
		
		a.add(22);
		a.add(90);
		a.add(75);
		a.add(67);
		a.add(13);
		a.add(44);
		
		ArrayList<Character> b=new ArrayList<>();
		
		b.add('A');
		b.add('B');
		b.add('C');
		b.add('D');
		b.add('E');
		System.out.println(a);
		System.out.println(b);
		
		a.addAll(b);
		System.out.println(a);
		
	}

}
