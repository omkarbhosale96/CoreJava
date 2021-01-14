package sumOfDigits;

public class SumOfDigits {

	public static void main(String[] args) {

		String a="Omkar@12345";
		char[] b=a.toCharArray();
		int sum=0;
		for(int i=0;i<b.length;i++)
		{
			if(a.charAt(i)>='0' && a.charAt(i)<='9')
			{
				sum=sum+Character.getNumericValue(a.charAt(i));
				
			}
		}
		System.out.println(sum);

	}

}
