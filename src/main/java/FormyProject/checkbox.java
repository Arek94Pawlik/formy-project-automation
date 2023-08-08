package FormyProject;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class checkbox {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arkadiusz\\Documents\\Chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/checkbox");

        WebElement checkbox1 = driver.findElement(By.id("checkbox-1"));
        checkbox1.click();

        WebElement checkbox2 = driver.findElement(By.cssSelector("input[value='checkbox-2']"));
        checkbox2.click();

        WebElement checkbox3 = driver.findElement(By.xpath("//*[@id=\"checkbox-3\"]"));
        checkbox3.click();

        driver.quit();

    }
}
