public class ThreadA extends Thread {


//    Java线程的等待与唤醒主要包括几个方法：
//            （1）notify()：唤醒在此对象监视器上等待的单个线程。
//            （2）notifyAll()：唤醒在此对象监视器上等待的所有线程。
//            （3）wait()：让当前线程处于阻塞状态，同时释放它所持有的锁。
//            （4）wait(long timeout)：让线程处于阻塞状态，直到其他线程调用此对象的notify()或者notifyAll()方法，或者超过指定的时间量，当前线程被唤醒。
//            （5）wait(long timeout,int nanos)：同上。

    public ThreadA(String name) {
        super(name);
    }

    public void run() {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " call notify()");
            // 唤醒当前的wait线程
            notify();
        }
    }
}
