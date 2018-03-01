public class Thread05 extends Thread {

    /**
     * sleep()的作用是让当前线程进入休眠，当前线程会由运行状态进入到阻塞状态，sleep()可以指定休眠时间，休眠时间会大于等于该休眠时间，在线程被重新唤醒时，线程的状态由阻塞状态变成就绪状态，从而等待CPU进行调度执行。
     * @param name
     */

    public Thread05(String name){
        super(name);
    }
    public synchronized void run() {
        try {
            for(int i=0; i <10; i++){
                System.out.printf("%s: %d\n", this.getName(), i);
                // i能被4整除时，休眠100毫秒
                if (i%4 == 0)
                    Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
