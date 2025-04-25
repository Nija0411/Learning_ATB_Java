package ex.lab023_threads;

class TH02 {
    public static void main(String[] args) {

        Thread t1 = Thread.currentThread();
        for (int i = 0; i < 10; i++) {
            System.out.println(t1.getName() + " - " + +i + " - " + t1.getThreadGroup() + " - " + t1.getPriority());
        }

    }
}
