public class NotifyAllTest04 {
    /**
     * yield()虽然可以让线程由运行状态进入到就绪状态，但最后谁获取CPU的执行权限是不一定的。
     * @param args
     */
    public static void main(String[] args) {

        ThreadA t1 = new ThreadA("t1");
        ThreadA t2 = new ThreadA("t2");
        t1.start();
        t2.start();
    }

}
