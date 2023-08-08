package FormyProject;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Dropdown {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arkadiusz\\Documents\\Chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropdown = driver.findElement(By.id("dropdownMenuButton"));
        dropdown.click();

        WebElement AutocompleteItem = driver.findElement(By.id("autocomplete"));
        AutocompleteItem.click();


        driver.quit();

    }

}
