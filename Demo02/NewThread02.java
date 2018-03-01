public class NewThread02 extends Thread {
    /**
     * （1）start()：作用是启动一个新的线程，新线程会执行线程中相应的run()方法，start()不能被重复调用，
     * （2）run()：该方法和普通的成员方法一样，可以被重复调用。如果直接调用run()的话，会在当前线程中执行run()，而并不会启动新的线程。
     * @param name
     */
    public NewThread02(String name) {
        super(name);
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running");
    }
}
