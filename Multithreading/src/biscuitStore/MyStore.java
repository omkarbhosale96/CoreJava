package biscuitStore;

public class MyStore {

	public static void main(String[] args) {
		Store s=new Store();
		Th1 t1=new Th1(s);
		Th2 t2=new Th2(s);
		
		t1.start();
		t2.start();

	}

}
