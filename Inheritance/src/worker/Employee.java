package worker;

public class Employee extends Worker {

	String workSp;
	void setEmpData()
	{
	
	name="Mad max";
	age=25;
	address="Calefornia";
	phNumber=9999;
	salary=45000;
	}
	void displayEmp()
	{
		workSp="Super Driver";
		System.out.println("Work specialization: "+workSp);
	}
}
