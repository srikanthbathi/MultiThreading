
CountDownLatch is used to make sure that the task to wait for other threads to finish.

While create an object of this CountDownLatch you have to specify the count of threads it has to wait for.

All these kind of threads are required to do count down  by doing CountDownLatch.countDown().


CountDownLatch syncLatch = new CountDownLatch(4);

new Thread(()->{
try{

}catch(){
}
syncLatch.countDown();
}).start();


....

syncLatch.await();

**Facts about CountDownLatch:**

Creating an object of CountDownLatch by passing an int to its constructor (the count), is actually number of invited parties (threads) for an event.
The thread, which is dependent on other threads to start processing, waits on until every other thread has called count down. All threads, which are waiting on await() proceed together once count down reaches to zero.
countDown() method decrements the count and await() method blocks until count == 0
