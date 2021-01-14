package employee;

public class Employee {
	String name,id;
	int salary,totalSal;
	Employee(String name,String id,int salary)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	int calculateSal()
	{
		// considering 15% of hike
	 totalSal=(int) (salary+salary*0.15);
	 return totalSal;
	}
	void display()
	{
		System.out.println("Employee name:"+name);
		System.out.println("Employee ID:"+id);
		System.out.println("Salary:"+totalSal);
	}

}
