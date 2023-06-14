package day9;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

   // public class Demo3
          //To Capture Screenshot of particular Section

    public class SeleniumDay9 {
    public static void main(String[] args) throws InterruptedException, IOException
        {

            ChromeOptions CO=new ChromeOptions();
            CO.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
            CO.addArguments("start-Maximized");

            WebDriver driver=new ChromeDriver(CO);

            //To enter URL/To open an Application
            driver.navigate().to("https://www.flipkart.com/search?q=redmi+note+10s&sid=tyy%2C4io&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_1_14_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_1_14_na_na_na&as-pos=1&as-type=HISTORY&suggestionId=redmi+note+10s%7CMobiles&requestId=2f02abd0-6677-443d-8632-fdee7f7bd630");

            Thread.sleep(2000);


            //To Capture Screenshot of particular Section

            WebElement S1=driver.findElement(By.xpath("(//div[@class='_2kHMtA'])[1]"));


            File Source=S1.getScreenshotAs(OutputType.FILE);


            File Destination=new File("C:\\Users\\chauhanuday\\Downloads\\Screenshot.jpg");

            FileHandler.copy(Source,Destination);


        }



    }

