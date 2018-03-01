public class MyThread implements Runnable {

    private int ticket = 10;

    /**
     * Runnable示例代码：实现Runnable接口，再通过Thread的构造函数创建线程。
     */
    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName() + " 卖票：ticket" + this.ticket--);
        // TODO 自动生成的方法存根
        for (int i = 0; i < 20; i++) {
            if (this.ticket > 0) {
            }
        }
    }

}
