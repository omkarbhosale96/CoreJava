package compareArrayList;

import java.util.ArrayList;

public class MyList {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
		
		a.add(22);
		a.add(90);
		a.add(75);
		a.add(67);
		a.add(13);
		a.add(44);
		
		ArrayList<Integer> b=new ArrayList<>();
		
		b.add(22);
		b.add(90);
		b.add(75);
		b.add(67);
		b.add(13);
		b.add(44);
		 
		
		System.out.println(b.equals(a));
	}

}
