package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Driver;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args)
    {
        //Invoke Chrome

        //System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        //driver.get("https://the-internet.herokuapp.com/");
        //driver.getTitle();
        //System.out.println(driver.getTitle());
        //driver.getCurrentUrl();
        //System.out.println(driver.getCurrentUrl());
        //driver.quit();

        //Invoke Firefox

        //System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        //WebDriver driver = new FirefoxDriver();
        //driver.get("https://the-internet.herokuapp.com/");
        //driver.quit();

        //Invoke Edge

        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.getTitle();
        System.out.println(driver.getTitle());
        driver.getCurrentUrl();
        System.out.println(driver.getCurrentUrl());
        driver.quit();


    }
}