package ex_lab.Lab009_inheritance.multilevel;

class RunnerClass {
    public static void main(String[] args) {

        GrandF gf = new GrandF();
        gf.grandf();

        System.out.println("----------------------------");
        Father f = new Father();
        f.father();
        f.grandf();

        System.out.println("----------------------------");
        Son s = new Son();
        s.son();
        s.father();
        s.grandf();
    }
}
