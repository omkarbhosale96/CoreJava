package removeAndReturn;

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
		
		int b=a.get(0);
		a.remove(0);
		System.out.println(a);
		System.out.println(b);

	}

}
