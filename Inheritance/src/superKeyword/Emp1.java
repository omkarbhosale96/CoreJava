package superKeyword;

public class Emp1 extends Emp {

	int salary;
	
	Emp1(String name,int id,int salary)
	{
		super(name,id);
		this.salary=salary;
	}
	void display()
	{
		System.out.println(name+" "+id+" "+salary);
	}
}
