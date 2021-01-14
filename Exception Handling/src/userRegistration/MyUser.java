package userRegistration;

public class MyUser {

	public static void main(String[] args) throws Exception {
		UserRegistration u=new UserRegistration();
		
		u.registerProfile("Max", "India", 19);
		if(u.country.compareToIgnoreCase("india")!=0)
		{
			throw new InvalidCountryException("you should be indian");
		}
		else if(u.age<18)
		{
			throw new InvalidAgeException("User is minor");
		}
		else
			System.out.println("Welcome");

	}

}
