import java.util.Scanner;

public class CompanyMenu {
	Operations op=new Operations();
	
	void getMenu()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the option:");
		System.out.println("1.Add, 2.Substract, 3.Multiply");
		int option=sc.nextInt();
			
			if(option==1)
			{
				op.sum();	
				
			}
			else if(option==2)
			{
				op.sub();
				
			}
			else if(option==3)
			{
				op.mul();
				
			}
			else 
			{
				System.out.println("Enter between 1 to 3");
			}
		
	}

}
