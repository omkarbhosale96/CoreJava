package characterType;
import java.util.Scanner;
public class CharType {
	
	char a;
	void getType()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter character");
		a=sc.next().charAt(0);
		
		if((a>='A' && a<='Z') || (a>='a' && a<='z'))
			System.out.println("Alphabet");
		else if(a>=48 && a<=57)
			System.out.println("Number");
		else
			System.out.println("Special character");
		sc.close();
	}

}
