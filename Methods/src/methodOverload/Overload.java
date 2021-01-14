package methodOverload;

public class Overload {

	public static void main(String[] args) {
		MethodOverload m=new MethodOverload();
		
		m.test("I am Groot");
		m.test(12, 11);
		m.test("Max", 45);
		m.test("Captain", 2000, 5);

	}

}
