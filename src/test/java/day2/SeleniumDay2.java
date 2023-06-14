package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDay2 {
    public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver","C:\\Users\\chauhanuday\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
       // webDriver.manage().window().maximize();
        webDriver.get("http://google.com");

         webDriver.quit();
    }
}
