package threadUI;

public class Thread2 {
	
	public static void main(String[] args) {
		
		
		
		
		// Create and start two threads
		Thread thread1 = new Thread(new MyRunnable("Thread1"));
		Thread thread2 = new Thread(new MyRunnable("Thread2"));
		
		thread1.start();
		thread2.start();
		
		// Wait for both threads to finish
		try {
			thread1.join();
			thread2.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println("Main thread finished");
	}
	
	static class MyRunnable implements Runnable {

		private final String name;
		
		public MyRunnable(String name) {
		this.name = name;
	}
		public void run() {
			System.out.println(name + "started.");
				
			
			// Do some work in this thread 
			for (int i = 0; i<5; i++) {
				System.out.println(name + ": " + i);
				// System.out.print("Testing some output");  // testing
				// thread 1 and 2 actions go here
				
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			System.out.println(name + "finished.");
			}
		}
	

}
	