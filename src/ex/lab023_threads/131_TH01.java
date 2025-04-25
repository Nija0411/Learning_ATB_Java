package ex.lab023_threads;

class TH01 {
    public static void main(String[] args) throws InterruptedException {

        Thread t = Thread.currentThread();
        System.out.println(t); //Thread[#1,main,5,main]

        for (int i = 0; i < 10; i++) {
            System.out.println(i + " - " + t.getName()); //main
            System.out.println(i + " - " + t.getPriority()); //5
            Thread.sleep(5000);
        }
    }
}
