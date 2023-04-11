package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTesting {
    static String browser = "Chrome";
    static WebDriver driver;
    static String baseUrl = "http://the-internet.herokuapp.com/login";

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser name");
        }
        //Open URL
        driver.get(baseUrl);
        //maximise browser
        driver.manage().window().maximize();
        //Print the title of the page
        System.out.println("Title: " + driver.getTitle());
        //Print the current url
        System.out.println("Current URL: " + driver.getCurrentUrl());
        //Print the page source
        System.out.println("Page Source: " + driver.getPageSource());
        //Enter the email to email field
        driver.findElement(By.id("username")).sendKeys("Maitriborad@gmail.com");
        //Enter the password to password field
        driver.findElement(By.id("password")).sendKeys("Maitri@123");
        //Close the browser
        driver.close();
    }
}