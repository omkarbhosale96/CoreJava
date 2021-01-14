package methodOverload;

public class MethodOverload {

	
	void test(String a)
	{
		System.out.println(a);
	}
	void test(String a,int b)
	{
		System.out.println(a+" "+b);
	}
	void test(int a, int b)
	{
		System.out.println(a+" "+b);
	}
	void test(String a,int b,int c)
	{
		System.out.println(a+" "+b+" "+c);
	}
}
