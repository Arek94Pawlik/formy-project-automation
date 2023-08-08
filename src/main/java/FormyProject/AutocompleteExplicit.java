package FormyProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class AutocompleteExplicit {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Arkadiusz\\Documents\\Chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("23 Spacerowa");

        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement errorPopUp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("dismissButton")));
        errorPopUp.click();

        driver.quit();

    }

}