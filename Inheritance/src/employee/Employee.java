package employee;

public class Employee {

	long empId;
	String empName;
	String empAdd;
	long empPh;
	double basicSal;
	double spAll=250.8;
	double hra=1000.50;
	
	Employee(long empId,String empName,String empAdd,long empPh,double basicSal)
	{
		this.empId=empId;
		this.empName=empName;
		this.empAdd=empAdd;
		this.empPh=empPh;
		this.basicSal=basicSal;
		
	}


	void CalSal()
	{
		double salary=basicSal+(basicSal*spAll/100)+(basicSal*hra/100);
		System.out.println("Total salary is:"+salary);
	}
	void calTransAllow()
	{
		double ta=10*basicSal/100;
		System.out.println("Salary with transport allowance:"+(ta+basicSal));
	}
}
