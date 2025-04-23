package ex.lab020_exceptions;

class ExceptionHandling {
    public static void main(String[] args) {

        int a =100;
        try{
            int out = a/0;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Ending the Program Here");
    }
}
