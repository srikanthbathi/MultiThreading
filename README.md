The current thread which invokes wait(), notify(), notifyAll() methods on any object should have the object monitor else it throws 
**java.lang.IllegalMonitorStateException exception**.

i.e All the above methods has to be used inside synchronized block.
