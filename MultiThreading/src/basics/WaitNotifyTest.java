package basics;

public class WaitNotifyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Message m = new Message("Process it");
Waiter waiter = new Waiter(m);
new Thread(waiter,"waiter").start();

Waiter waiter1 = new Waiter(m);
new Thread(waiter1,"waiter1").start();

Notifier notifier = new Notifier(m);
new Thread(notifier,"notifier").start();

System.out.println("all threads have crossed runnable state");


	}

}
