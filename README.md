The current thread which invokes wait(), notify(), notifyAll() methods on any object should have the object monitor else it throws 
**java.lang.IllegalMonitorStateException exception**.

i.e All the above methods has to be used inside synchronized block.

**Diff between wait() and sleep()**
**wait()** is final instance method define in java.lng.object. It can only be called inside a synchronized block because it releases the lock on the objet and allows other waiting thread to acquire the lock on the object.
On the other hand **sleep()** is a static method defined in Thread class that can be called from any context. It just pauses the current running thread and doesent release any lock.

**Achieve Thread Safety in JAVA**:
Thread safety can be achieved in JAVA by creating **Immutable class, synchronization, thread safe classes, atomic concurrent classes and by implemeting concurrent lock interface** .  https://www.journaldev.com/1061/thread-safety-in-java

**Thread Safety in Java**
Thread safety in java is the process to make our program safe to use in multithreaded environment, there are different ways through which we can make our program thread safe.

**Synchronization** is the easiest and most widely used tool for thread safety in java.
Use of **Atomic Wrapper classes from java.util.concurrent.atomic package**. For example AtomicInteger
Use of **locks from java.util.concurrent.locks package**.
Using **thread safe collection classes**,
Using **volatile keyword with variables** to make every thread read the data from memory, not read from thread cache.




