package basics;

public class Notifier implements Runnable {
  private Message msg;
   public Notifier(Message m) {
	this.msg = m;
  }
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
        System.out.println(name+" started");
        try {
			Thread.sleep(1000);
			synchronized(msg){
				msg.setMsg(name+" Notifier work done");
				//msg.notify();    when we call notify method on an object it will notify only one object in wait state 
				msg.notifyAll();  // will notify all the objects in wait 
	        }
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		
	}

}
