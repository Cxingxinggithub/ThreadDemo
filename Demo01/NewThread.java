public class NewThread extends Thread {

    private int ticket = 10;

    /**
     * Thread本身是一个类，然后它实现了Runnable接口，因此在使用Thread时我们只需要继承Thread并重写它的run()方法就好。
     */
    public void run() {
        for (int i = 0; i < 20; i++) {
            if (this.ticket > 0) {
                System.out.println(this.getName() + " 卖票：ticket" + this.ticket--);
            }
        }
    }
}
