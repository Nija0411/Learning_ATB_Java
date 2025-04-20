package ex.lab017_enums;

class Example1 {
    public static void main(String[] args) {
        System.out.println(Days.Fri);
        System.out.println(Project_URLs.restassured);
    }
}
enum Days{
    Monday, Tue, Wed, Thu, Fri, Sat, Sun
}

enum Project_URLs{
    google, katalon, restassured, vwo;
}
