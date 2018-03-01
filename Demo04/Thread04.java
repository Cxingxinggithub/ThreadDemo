public class Thread04 extends Thread {

    public Thread04(String name){
        super(name);
    }

    /**
     * yield()函数的作用是让步，它让当前线程由运行状态进入就绪状态，而不是像wait()一样进入阻塞状态。因此，并不能保证在当前线程调用yield()之后，其他具有相同优先级的线程一定能获得执行权，也有可能是当前线程又重新进入了运行状态。
     */
    public synchronized void run(){
        for(int i=0; i <10; i++){
            System.out.printf("%s [%d]:%d\n", this.getName(), this.getPriority(), i);
            // i整除4时，调用yield
            if (i%4 == 0)
                Thread.yield();
        }
    }

}
