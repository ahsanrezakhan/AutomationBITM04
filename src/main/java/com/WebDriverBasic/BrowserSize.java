package com.WebDriverBasic;

import org.openqa.selenium.Dimension;

public class BrowserSize extends Browser{
    public static void main(String[] args) {
        //chrome_launch();
        firefox_launch();
        get_Browser_maximize_size();
        iPad();
        //chrome_close();
        firefox_close();


    }
    public static void get_Browser_maximize_size(){
        int width = driver.manage().window().getSize().getWidth();
        int height = driver.manage().window().getSize().getHeight();
        System.out.println(" Width : " +width+" Height : "+height);
        // Width : 1552 Height : 840
    }
    public static void iPad(){
        driver.manage().window().setSize(new Dimension(768, 600));
        int width = driver.manage().window().getSize().getWidth();
        int height = driver.manage().window().getSize().getHeight();
        System.out.println("iPad Width : " +width+" iPad Height : "+height);
    }
}
