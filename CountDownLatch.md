
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
