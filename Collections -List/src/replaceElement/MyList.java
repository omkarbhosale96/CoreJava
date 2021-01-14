package replaceElement;

import java.util.LinkedList;

public class MyList {

	public static void main(String[] args) {
		LinkedList<Integer> a=new LinkedList<>();	
		a.add(22);
		a.add(90);
		a.add(75);
		a.add(67);
		a.add(13);
		a.add(44);
		
		a.set(0,23);
		System.out.println(a);

	}

}
