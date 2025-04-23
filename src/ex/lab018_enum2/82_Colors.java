package ex.lab018_enum2;

enum Colors {
    red("#880808"), green("#00FF00"), blue("#0000FF");

    private String color_hexCode;

    Colors(String color){
        this.color_hexCode =color;
    }

    String getColor_hexCode(){
        return color_hexCode;
    }
}
