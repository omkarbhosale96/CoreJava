package removeElement;
import java.util.ArrayList;
public class MyList {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<>();
		
		a.add("max1");
		a.add("max2");
		a.add("max3");
		a.add("max4");
		a.add("max5");
		a.add("max6");
		System.out.println(a);
		a.remove("max3");
		System.out.println(a);

	}

}
