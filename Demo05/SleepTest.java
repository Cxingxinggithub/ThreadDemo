public class SleepTest {
    /**
     * sleep() 和wait()的作用是让线程由运行状态进入阻塞状态，但sleep()不会释放对象的锁，wait()会释放对象的同步锁。
     * @param args
     */
    public static void main(String[] args){
        ThreadA t1 = new ThreadA("t1");
        t1.start();
    }

}
