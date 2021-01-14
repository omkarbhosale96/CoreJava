package employee;
import java.util.*;
public class MyList {

	public static void main(String[] args) {
		ArrayList<Employee> a=new ArrayList<>();
		a.add(new Employee("Max",12,12000));
		a.add(new Employee("Groot",13,12400));
		a.add(new Employee("Captain",14,12000));
		a.add(new Employee("Thor",15,12200));
		a.add(new Employee("Stark",16,12000));
		
		
		Collections.sort(a,new EmpComparator());
		
		Iterator<Employee> it=a.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
