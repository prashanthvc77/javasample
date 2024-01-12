package samples;

public class ThreadImplements implements Runnable{

	public static void main(String[] args) {
		ThreadImplements r1 = new ThreadImplements();
		Thread t1 = new Thread (r1);
		t1.start();
		

	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
            System.out.println("Thread: " + Thread.currentThread().getId() + " Count: " + i);
        }
		
	}

}
