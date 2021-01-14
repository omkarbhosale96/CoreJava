package employee;

public class Manager extends Employee {

	Manager(long empId,String empName,String empAdd,long empPh,double basicSal)
	{
		super(empId,empName,empAdd,empPh,basicSal);
		
		
	}
	void calTransAllow()
	{
		double ta=15*basicSal/100;
		System.out.println("Salary with transport allowance:"+(ta+basicSal));
	}
}
