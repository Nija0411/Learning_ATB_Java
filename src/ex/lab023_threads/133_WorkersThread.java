package ex.lab023_threads;

class WorkedThread {
    public static void main(String[] args) {


        Worker w1 = new Worker();
        w1.start(); //Thread-0

//        w1.run(); if you call by this way jvm will not create the thread it will simply run the run method

        Worker w2 = new Worker(); //Thread-1
        w2.start(); //Thread-1


        for (int i = 0; i < 5; i++) { //main thread
            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}


class Worker extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}