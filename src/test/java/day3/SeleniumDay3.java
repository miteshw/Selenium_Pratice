package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class SeleniumDay3 {
    public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver","C:\\Users\\chauhanuday\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("http://www.google.com");

        WebElement element = webDriver.findElement(By.id("elementId"));
                Actions action = new Actions(webDriver);
                    action.moveToElement(element).build().perform();

            }
        }





