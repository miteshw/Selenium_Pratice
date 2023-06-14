package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import javax.activation.FileDataSource;
import java.io.File;
import java.io.IOException;
import java.nio.file.attribute.FileStoreAttributeView;

public class SeleniumDay7 {

        public static void main(String[] args) throws InterruptedException, IOException {
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-error");
                chromeOptions.addArguments("Start-Maximized");



                WebDriver webDriver = new ChromeDriver(chromeOptions);
                webDriver.navigate().to("http://kite.zerodha.com/");
                //webDriver.manage().window().maximize();
                //webDriver.get("http://facebook.com");
                Thread.sleep(2000);

               // webDriver.findElement(By.xpath("//a[contains(@class,'_42ft _4jy0 _6lti _4jy6 _4jy2')] ")).click();
                File source = ((TakesScreenshot)webDriver).getScreenshotAs(OutputType.FILE);
                System.out.println(source);

                File destination = new File("C:\\Users\\chauhanuday\\Downloads\\Screenshot.jpg");

                FileHandler.copy(source,destination);
        }

}
