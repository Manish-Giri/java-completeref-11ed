package multithreading.creatingthreads.runnable;

class MyThread implements Runnable {

    Thread t;
    String name;

    MyThread(String name) {
        this.name = name;
        // call thread constructor - new Thread(Runnable obj, String name)
        t = new Thread(this, this.name);
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(t.getName() + " : " + i);
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }

    }

}

class Program {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // create three child threads by creating three objects of mythread
        MyThread obj1 = new MyThread("First Thread");
        MyThread obj2 = new MyThread("Second Thread");
        MyThread obj3 = new MyThread("Third Thread");

        obj1.t.start();
        obj2.t.start();
        obj3.t.start();

    }

}
