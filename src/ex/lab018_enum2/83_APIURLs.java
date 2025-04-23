package ex.lab018_enum2;

enum APIURLs {

    google("https://google.com"),
    katalon("https://katalon.com"),
    vwo("https://app.vwo.com");

    private String apiUrls;

    APIURLs(String apiUrls){
        this.apiUrls = apiUrls;
    }

    public String getApiUrls() {
        return apiUrls;
    }
}
