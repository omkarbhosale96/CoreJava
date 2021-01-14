package employee;

public class TrainersActivity {

	public static void main(String[] args) {
		Employee em=new Employee(612, "Max", "Calefornia", 7777, 22000);
		Manager mg =new Manager(611, "Raju", "Delhi", 0000, 10000);
		
		em.CalSal();
		em.calTransAllow();
		System.out.println();
		mg.CalSal();
		mg.calTransAllow();

	}

}
