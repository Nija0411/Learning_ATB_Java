package ex.lab018_enum2;

import ex.lab009_inheritance.multilevel.Son;

class MainClass {
    public static void main(String[] args) {

        System.out.println("Locators------------------------");
        System.out.println(Locators.page_button.getLocators());
        System.out.println(Locators.page_input.getLocators());

        System.out.println("Colors----------------------------");
        System.out.println(Colors.red.getColor_hexCode());
        System.out.println(Colors.blue.getColor_hexCode());

        System.out.println("API URLs----------------------------");
        System.out.println(APIURLs.google.getApiUrls());
        System.out.println(APIURLs.vwo.getApiUrls());

    }
}
