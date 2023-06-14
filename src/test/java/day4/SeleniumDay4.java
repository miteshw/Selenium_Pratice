package day4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumDay4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\chauhanuday\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-error");
        chromeOptions.addArguments("Start-Maximized");


       // System.setProperty("webdriver.chrome.driver","C:\\Users\\chauhanuday\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver(chromeOptions);
        webDriver.navigate().to("http://facebook.com");
        //webDriver.manage().window().maximize();
        //webDriver.get("http://facebook.com");
        Thread.sleep(2000);
        webDriver.findElement(By.xpath("//a[contains(@class,'_42ft _4jy0 _6lti _4jy6 _4jy2')] ")).click();
        webDriver.findElement(By.xpath("//div[text()='Surname']")).sendKeys("Mitesh");


    }
}
