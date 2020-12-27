package checkCase;

import java.util.Scanner;

public class CheckCase {
	
	char a;
	
	void checkChar()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter character");
		a=sc.next().charAt(0);
		if(a>='A' && a<='Z')
			System.out.println("Upper Case");
		else if(a>='a' && a<='z')
			System.out.println("Lower Case");
		else 
			System.out.println("Invalid character");
		sc.close();
	}

}
