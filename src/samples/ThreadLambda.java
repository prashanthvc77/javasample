package samples;

public class ThreadLambda {

	public static void main(String[] args) {
		
		Runnable runnable = ()->{
			long id = Thread.currentThread().getId();
			System.err.println(id);
		};
		
		Thread t1 = new Thread(runnable);
		t1.start();
	}

}
