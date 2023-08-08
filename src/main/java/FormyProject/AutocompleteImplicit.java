package FormyProject;

        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.By;

        import java.util.concurrent.TimeUnit;

public class AutocompleteImplicit {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Arkadiusz\\Documents\\Chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("23 Spacerowa");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement errorPopUp = driver.findElement(By.className("dismissButton"));
        errorPopUp.click();

        driver.quit();

    }

}