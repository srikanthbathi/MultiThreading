package basics;
// When we run the following java code in debug mode and normal mode, we get two different outputs.
//Program running in normal mode outputs as follow. 
/*
 main method runs
Thread running
 */   //because,  At a time one thread is executed only. So now the current thread is running the main method, the fist sysout will be 
//main method runs and then "Thread running"


// try putting the Thread.sleep(2000); after start() method then the output order will be different.
//this is because the current thread is idle for 2000ms, the cpu gets allocated other thread we created.



public class Client extends Thread{
	
	@Override
	public void run(){
		System.out.println("Thread running");
	}

	public static void main(String[] args) throws InterruptedException {
		
		Client c = new Client();
		
        c.start();
        Thread.sleep(2000);
        System.out.println("main method runs");
	}

}
