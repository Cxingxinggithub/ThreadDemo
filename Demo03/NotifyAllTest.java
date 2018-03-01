public class NotifyAllTest {
    /**
     * 刚开始每个线程都运行wait将其他线程阻塞，最后main线程重新获得资源，运行notify()函数，唤醒所有的线程。
     */
//    为什么notify()，wait()等函数定义在Object中，而不是Thread类中。
//    Object中的wait()，notify()等函数，和synchronized一样，会对对象的同步锁进行操作。wait()会使当前线程处于阻塞状态，是因为该线程进入了阻塞状态，所以线程应该释放了它拥有的同步锁，否则其他线程无法运行。wait()等待线程和notify()之间是通过什么关联起来的？答案是对象的同步锁。负责唤醒等待线程的那个线程，只有它在获取了该对象的同步锁之后，才调用notify或notify（）方法之后，才能唤醒等待线程。
//    总之，notify()，wait()依赖于同步锁，而同步锁是对象锁持有，并且每个对象有且仅有一个，这就是为什么notify()和wait()等函数定义在object类，而不是Thread类中的原因。
    private static Object obj = new Object();

    public static void main(String[] args) {

        ThreadA t1 = new ThreadA("t1");
        ThreadA t2 = new ThreadA("t2");
        ThreadA t3 = new ThreadA("t3");
        t1.start();
        t2.start();
        t3.start();
        try {
            System.out.println(Thread.currentThread().getName() + " sleep(3000)");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (obj) {
            // 主线程等待唤醒。
            System.out.println(Thread.currentThread().getName() + " notifyAll()");
            obj.notifyAll();
        }
    }

    static class ThreadA extends Thread {

        public ThreadA(String name) {
            super(name);
        }

        public void run() {
            synchronized (obj) {
                try {
                    // 打印输出结果
                    System.out.println(Thread.currentThread().getName() + " wait");
                    // 唤醒当前的wait线程
                    obj.wait();
                    // 打印输出结果
                    System.out.println(Thread.currentThread().getName() + " continue");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
