package worker;

public class Company {

	public static void main(String[] args) {
		Employee emp=new Employee();
		Manager mg=new Manager();
		
		emp.setEmpData();
		mg.setManData();
		emp.displayData();
		emp.displayEmp();
		System.out.println();
		mg.displayData();
		mg.displayMan();
		

	}

}
