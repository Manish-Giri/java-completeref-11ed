package CH11;

public class FirstThread implements Runnable{

    private String name;
    private Thread thread;

    public FirstThread(String name) {
        this.name = name;
        this.thread = new Thread(this, name);
        System.out.println("Created new thread: " + thread);
    }


    @Override
    public void run() {
        for (int i = 10; i > 0 ; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
