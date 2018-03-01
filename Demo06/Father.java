public class Father extends Thread {

    public void run() {
        Son s = new Son();
        s.start();
        try {
            s.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
