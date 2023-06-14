import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class FirstSeleniumProject {
    public static void main(String[] args) {
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\chauhanuday\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.google.com");
        webDriver.quit();

    }
}