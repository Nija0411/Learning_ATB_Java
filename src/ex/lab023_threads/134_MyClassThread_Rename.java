package ex.lab023_threads;

class MyClassThread_Rename {
    public static void main(String[] args) {

        //Renaming the threadGroup
        ThreadGroup threadGroup = new ThreadGroup("MyClassTG");

        //Renaming Thread-0 as MC1
        MyClass m1 = new MyClass(threadGroup, "MC1");
        m1.start();

        MyClass m2 = new MyClass(threadGroup, "MC2");
        m2.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000); //1 sec
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}

class MyClass extends Thread {


    public MyClass(ThreadGroup threadGroup, String name) {
        super(threadGroup, name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(2000); //2 sec
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
