package Practise;

public class PrintSequenceUsingThreads {
private static final int n = 10;
private static volatile int counter = 1;
	public static void main(String[] args) {
		Thread t1 = new Thread(new PrintTask(1));
		Thread t2 = new Thread(new PrintTask(2));
		Thread t3 = new Thread(new PrintTask(3));
		t1.start();
		t2.start();
		t3.start();
	}
	private static class PrintTask implements Runnable{
		private  final int id;
		
		public PrintTask(int id) {
			super();
			this.id = id;
		}

		@Override
		public void run() {
			while (counter <=n) {
				synchronized (PrintSequenceUsingThreads.class){
					if (counter % 3 == id - 1) {
						System.out.println("Thread " + id + ": " + counter);
						counter++;
						PrintSequenceUsingThreads.class.notifyAll();
					}
					else {
					try {
						PrintSequenceUsingThreads.class.wait();
					}
					catch (InterruptedException e) {
						e.printStackTrace();
					}
					}
				}
			}
		}
		
	}
}
