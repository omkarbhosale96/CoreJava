package palindrome;

public class Palindrome {
	int number;
	void getNumber(int number)
	{
		this.number=number;
		int temp=number;
		int rev=0;
		int rem;
		
		while(temp>0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(rev==number)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}

}
