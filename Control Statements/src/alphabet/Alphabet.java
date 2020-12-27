package alphabet;

public class Alphabet {
	
	char a;
	void checkAlpha(char a)
	{
		this.a=a;
		if(a=='A' || a=='E'|| a=='O' || a=='U' || a=='I' || a=='a' || a=='e' || a=='i' || a=='o' || a=='u')
		
			System.out.println("Vowel");
		
		else
			System.out.println("Consonant");
	}

}
