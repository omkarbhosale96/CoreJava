package updateElement;
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
		
		System.out.println(a);
		a.set(2, 96);
		
		System.out.println(a);

	}

}
