package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;

public class SeleniumDay8 {

    public static void main(String[] args) throws InterruptedException, IOException {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("\"--remote-allow-origins=*\",\"ignore-certificate-error\"");
        chromeOptions.addArguments("Start-Maximized");

        WebDriver webDriver = new ChromeDriver(chromeOptions);
        webDriver.navigate().to("https://www.flipkart.com/search?q=redmi+mobile&as=on&as-show=on&otracker=AS_Query_OrganicAutoSuggest_4_3_na_na_na&otracker1=AS_Query_OrganicAutoSuggest_4_3_na_na_na&as-pos=4&as-type=RECENT&suggestionId=redmi+mobile&requestId=97383226-d0bb-40d5-971e-c2a16310a9c0&as-searchtext=red");
        Thread.sleep(2000);
        WebElement s1 = webDriver.findElement(By.xpath("(//div[@class='_2kHMtA')[1]"));


    }

}


