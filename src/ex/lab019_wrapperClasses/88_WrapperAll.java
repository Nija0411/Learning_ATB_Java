package ex.lab019_wrapperClasses;

class WrapperAll {
    public static void main(String[] args) {
        Mobile iphone = new Mobile(1, "Iphone", 90000.89);
        Mobile samsung = new Mobile();

        iphone.setPrice(200000.89);
        iphone.display();
        samsung.display();

        System.out.println(Mobile.mobile_carrier);
        Mobile.switchOnAirplaneMode();

    }
}

class Mobile extends OldPhone {
    private Integer phoneId;
    private String phoneName;
    private Double price;
    static String mobile_carrier = "airtel";

    Mobile() {
        System.out.println("DC");
    }

    public Mobile(Integer phoneId, String phoneName, Double price) {
        this.phoneId = phoneId;
        this.phoneName = phoneName;
        this.price = price;
    }

    void display(){
        System.out.println(this.phoneId +" " +this.phoneName + " " +this
                .price);
    }
    public static String getMobile_carrier() {
        return mobile_carrier;
    }

    public static void setMobile_carrier(String mobile_carrier) {
        Mobile.mobile_carrier = mobile_carrier;
    }

    public Integer getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(Integer phoneId) {
        this.phoneId = phoneId;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    static void switchOnAirplaneMode() {
        System.out.println("Common Airplane Mode - static");
    }

    void priceChange(Integer priceChange) {
        System.out.println("Price change in Integer");
    }

    void priceChange(Double priceChange) {
        System.out.println("Price change in Decimal");
    }

    @Override
    void calling() {
        System.out.println("Dail Pad- touch screen");
        ;
    }
}

class OldPhone implements SimCard {

    void calling() {
        System.out.println("Dail Pad");
    }

    @Override
    public void enterCard() {
        System.out.println("Card is entered");
    }
}

interface SimCard {
    void enterCard();
}
