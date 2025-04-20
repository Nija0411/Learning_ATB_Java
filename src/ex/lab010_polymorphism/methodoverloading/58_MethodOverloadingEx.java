package ex.lab010_polymorphism.methodoverloading;

class MethodOverloadingEx {
    public static void main(String[] args) {

        Sum sum = new Sum();
        System.out.println(sum.calculateSum(14.5, 30.0));
        System.out.println(sum.calculateSum(10,15));
        System.out.println(sum.calculateSum(10,10,10));
    }
}

class Sum{

    int calculateSum(int a, int b){
        return a+b;
    }

    int calculateSum(int a, int b, int c){
        return a+b+c;
    }

    double calculateSum(double a, double b){
        return a+b;
    }
}