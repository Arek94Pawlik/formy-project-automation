package FormyProject;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Datepicker {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arkadiusz\\Documents\\Chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");

        WebElement datepicker = driver.findElement(By.id("datepicker"));
        datepicker.click();

        datepicker.sendKeys("03/03/2023");
        datepicker.sendKeys(Keys.RETURN);

        driver.quit();

    }

}
