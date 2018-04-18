package basics;

public class TRunnable {
	
	Runnable r = ()->{
		String tName = Thread.currentThread().getName();
		System.out.println(tName);
	};
	
	public TRunnable() {
		System.out.println("From run() method");
		r.run();
		Thread t = new Thread(this.r);
		System.out.println("From start() method");
		 t.start();
	}

}
