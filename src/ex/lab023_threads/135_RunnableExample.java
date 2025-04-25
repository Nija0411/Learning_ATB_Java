package ex.lab023_threads;

class RunnableExample {
    public static void main(String[] args) {

        ThreadGroup threadGroup = new ThreadGroup("WorkerGrp");

        Runnable w1 = new Worker2();
        Thread t1 = new Thread(threadGroup, w1, "Worker1");
        t1.start();

        Runnable w2 = new Worker2();
        Thread t2 = new Thread(threadGroup, w2, "Worker2");
        t2.start();

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}

class Worker2 implements Runnable {


    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
