package com.WebDriverBasic;

public class WebsiteLaunch extends Browser {
    public static void main(String[] args) {
        chrome_launch();
        open_URL();
        chrome_close();
    }
    public static void open_URL(){
        driver.get("https://google.com");

    }

}
