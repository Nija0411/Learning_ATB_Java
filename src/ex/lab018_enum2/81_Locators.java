package ex.lab018_enum2;

enum Locators {

    page_button("#button"),
    page_input("#input");

    private String locators;


    Locators(String locators) {
        this.locators = locators;
    }

    public String getLocators() {
        return locators;
    }
}
