package employee;

import java.util.Comparator;

public class EmpComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.salary>o2.salary)
			return 1;
		else if(o1.salary<o2.salary)
			return -1;
		else
		{
			if(o1.name.compareTo(o2.name)>0)
				return -1;
			else if(o1.name.compareTo(o2.name)<0)
				return 1;
			else 
				return 0;
		}
	}
	

	

}
