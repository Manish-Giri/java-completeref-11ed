package multithreading.mainthread;

/**
 * Main thread is the default thread of every java program
 */
class Program {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Thread t = Thread.currentThread();
        System.out.println(t);
        t.setName("Main Thread");
        System.out.println(t);
        System.out.println("Priority of main thread = " + t.getPriority());
        System.out.println("---------");

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(i);
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }

        }

        // is thread still alive
        System.out.println("Main thread status = " + t.isAlive());
    }
}
