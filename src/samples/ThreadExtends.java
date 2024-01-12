package samples;

public class ThreadExtends extends Thread{

	public static void main(String[] args) {
		ThreadExtends t1 = new ThreadExtends();
		t1.start();
		
		ThreadExtends t2 = new ThreadExtends();
		t2.start();

	}
	
	public void run() {
		for (int i = 1; i <= 5; i++) {
            System.out.println("Thread: " + Thread.currentThread().getId() + " Count: " + i);
        }
	}

	
}
