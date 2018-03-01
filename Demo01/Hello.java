public class Hello {
    /**
     * 在Java中常用的实现多线程的两种方式是使用Thread类或者实现Runnable接口。
     *
     * @param agrs
     */

    public static void main(String[] agrs) {
        MyThread myThread = new MyThread();
        Thread t1 = new Thread(myThread);
        Thread t2 = new Thread(myThread);
        Thread t3 = new Thread(myThread);

        t1.start();
        t2.start();
        t3.start();

        System.out.println("----------------------");

        NewThread t11 = new NewThread();
        NewThread t21 = new NewThread();
        NewThread t31 = new NewThread();

        t11.start();
        t21.start();
        t31.start();
    }
}
