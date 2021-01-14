package joinThreads;

public class MainThread {

	public static void main(String[] args) throws InterruptedException {
		ChildThread c=new ChildThread();
		c.start();
		c.join();
		System.out.println("Main");

	}

}
