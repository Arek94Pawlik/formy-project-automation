package SamplePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class HelloWorld {

    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Arkadiusz\\Documents\\Chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.google.com");

        WebElement odrzuc = driver.findElement(By.id("W0wltc"));

        odrzuc.click();

        WebElement element = driver.findElement(By.name("q"));

        element.sendKeys("Cheese!");

       driver.quit();



    }

}
