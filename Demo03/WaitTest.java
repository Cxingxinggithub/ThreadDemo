public class WaitTest {
    /**
     * 对于结果可能有些人不理解第二个输出（main wait），说明此时main线程还在运行着，其实t1.wait()的意思含义是停止当前的线程，当然就是CPU上正在运行的程序，这样整个的结果输出就比较合理，t1在运行run()函数会运行notify()，main线程开始重新运行。
     * @param args
     */
    public static void main(String[] args) {
        ThreadA t1 = new ThreadA("t1");
        synchronized (t1) {
            try {
                // 启动“线程t1”
                System.out.println(Thread.currentThread().getName() + " start t1");
                t1.start();
                // 主线程等待t1通过notify()唤醒。
                System.out.println(Thread.currentThread().getName() + " wait()");
                t1.wait();
                System.out.println(Thread.currentThread().getName() + " continue");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
