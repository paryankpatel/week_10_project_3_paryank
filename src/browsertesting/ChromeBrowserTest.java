package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "http://the-internet.herokuapp.com/login";
        //Setup Chrome browser
        WebDriver driver = new ChromeDriver();
        //Open URL
        driver.get(baseUrl);
        //maximise browser
        driver.manage().window().maximize();
        //Print the title of the page
        System.out.println("Title: "+driver.getTitle());
        //Print the current url
        System.out.println("Current URL: "+driver.getCurrentUrl());
        //Print the page source
        System.out.println("Page Source: "+driver.getPageSource());
        //Enter the email to email field
        driver.findElement(By.id("username")).sendKeys("Maitriborad@gmail.com");
        //Enter the password to password field
        driver.findElement(By.id("password")).sendKeys("Maitri@123");
        //Close the browser
        driver.close();
    }
}
