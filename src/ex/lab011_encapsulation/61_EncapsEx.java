package ex.lab011_encapsulation;

class EncapsEx {
    public static void main(String[] args) {

        PublicAtt att = new PublicAtt("nija", "123");
//        System.out.println(att.username = "NIJA0411");
//        System.out.println(att.password = "Asd123");
        System.out.println(att.username);
        att.password = "Asd123";
        System.out.println(att.password);

        PvtAtt att1 = new PvtAtt("Nik", "09"); //No error because of the constructor
//        System.out.println(att1.name); compile error
//        System.out.println(att1. pswd); compile error

        att1.setUsername("Nikhita");
        System.out.println(att1.getUsername());
//      System.out.println(att1.Username()); compile error

        att1.setPassword("11", false); //isAdmin is controller here only he can change the pswd
        System.out.println(att1.getPassword());

    }
}

class PublicAtt {

    public String username;
    public String password;

    PublicAtt(String name, String pswd) {
        this.username = name;
        this.password = pswd;
    }
}

class PvtAtt {

    private String username;
    private String password;

    PvtAtt(String name, String pswd) {
        this.username = name;
        this.password = pswd;

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isAdmin) {
        if (isAdmin) {
            this.password = password;
        } else {
            System.out.println("Change Password is not Allowed");
        }
    }

}
