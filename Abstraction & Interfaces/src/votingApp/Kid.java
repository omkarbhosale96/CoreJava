package votingApp;

import java.util.Scanner;

public class Kid implements VotingApp{

	int age;
	@Override
	public void registerUser() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		age=sc.nextInt();
		if(age<12)
			System.out.println("You have successfully registered under kids");
		else
			System.out.println("You have not registered");
	}

	@Override
	public void reqVotingNo() {
		if(age<12)
			System.out.println("Sorry cannot go for voting because Age must be greater than 12 to vote");
		else
			System.out.println("Oops you are not");
		
	}

}
