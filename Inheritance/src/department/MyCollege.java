package department;

public class MyCollege {

	public static void main(String[] args) {
		Department d=new Department("Mechanical", "Mr.Nagraj");
		StaffMember s=new StaffMember("Iron man", "M.tech in Robotics");
		
		d.showDeptDetails();
		s.showStaff();

	}

}
