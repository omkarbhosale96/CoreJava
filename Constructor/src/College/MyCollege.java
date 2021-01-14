package College;

public class MyCollege {

	public static void main(String[] args) {
		College c=new College();
		
		College.Department d=c.new Department();
		
		d.mechanical();
		d.civil();

	}

}
