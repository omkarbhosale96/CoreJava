package employee;



public class Employee{

	String name;
	int empId;
	int salary;
	public Employee(String name,int empId,int salary)
	{
		this.name=name;
		this.empId=empId;
		this.salary=salary;
		
	}
	public String toString()
	{
		return name+" "+empId+" "+salary;
	}
	
	
	
	
	
	
}
