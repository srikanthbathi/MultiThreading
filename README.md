https://dzone.com/articles/threads-top-80-interview

https://dzone.com/articles/how-to-test-if-your-multi-threaded-java-rest-servi

https://tarunsapra.wordpress.com/2011/08/21/spring-singleton-request-session-beans-and-thread-safety/

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

**ThreadLocal**
Java ThreadLocal is used to create thread-local variables. We know that all threads of an Object share it’s variables, so if the variable is not thread safe, we can use synchronization but if we want to avoid synchronization, we can use ThreadLocal variables.
Every thread has it’s own ThreadLocal variable and they can use it’s get() and set() methods to get the default value or change it’s value local to Thread. ThreadLocal instances are typically private static fields in classes that wish to associate state with a thread. 

**Thread Dump**



**The significant differences between extending Thread class and implementing Runnable interface:**

When we extend Thread class, we can’t extend any other class even we require and When we implement Runnable, we can save a space for our class to extend any other class in future or now.
When we extend Thread class, each of our thread creates unique object and associate with it. When we implements Runnable, it shares the same object to multiple threads.



