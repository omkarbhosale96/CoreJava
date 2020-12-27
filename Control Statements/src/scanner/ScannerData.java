package scanner;

import java.util.Scanner;

public class ScannerData {

	
	void getData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Give Integer");
		int a=sc.nextInt();
		System.out.println("Give String");
		String b=sc.next();
		System.out.println("Give character");
		char c=sc.next().charAt(0);
		
		
		System.out.println(a+" "+b+" "+c);
		sc.close();
	}
}
