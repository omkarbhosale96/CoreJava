package votingApp;

import java.util.Scanner;

public class Adult implements VotingApp {

	int age;
	@Override
	public void registerUser() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		age=sc.nextInt();
		if(age>12)
			System.out.println("You have successfully registered under adults");
		else
			System.out.println("You have not registered");
	}

	@Override
	public void reqVotingNo() {
		if(age<12)
			System.out.println("Your voting Id will be generated within a day");
		else
			System.out.println("Oops you are not");
		
	}
}
