public class Hello02 {
    /**
     * Thread.currentThread().getName()是用于获取当前线程的名字，当前线程是指正在cpu中调度执行的线程。
     * @param args
     */
    public static void main(String[] args) {
        NewThread02 t1 = new NewThread02("thread1");

        System.out.println(Thread.currentThread().getName() + " running");

        t1.run();

        System.out.println(Thread.currentThread().getName() + " starting");

        t1.start();

    }
}
