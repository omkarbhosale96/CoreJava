package employee1;

import java.util.Scanner;

public class Employee1 {

	
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id");
		id=sc.nextInt();
		
	}
	public String getName() {
		return name;
	}
	public void setName() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		name=sc.next();
		
	}
	
	
}
