package checkIfOnlyDigits;

public class CheckIfOnlyDigits {

	public static void main(String[] args) {
		String s="4161180";
		boolean flag=false;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			
				flag=true;
				
			else
				flag=false;
		}
		if(flag)
			System.out.println("All are digits");
		else
			System.out.println("All are not digits");
		
		
	}

}
