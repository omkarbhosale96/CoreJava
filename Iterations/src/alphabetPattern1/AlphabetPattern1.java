package alphabetPattern1;

public class AlphabetPattern1 {

	
	void getPattern()
	{
		for(int i=1;i<=7;i++)
		{
			char a='A';
			for(int j=1;j<=13;j++)
			{
				
				if(i+j<=8 || j-i>=6 )
				{
					System.out.print(a);
					if(j<=6)
						a++;
					else 
						a--;
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
