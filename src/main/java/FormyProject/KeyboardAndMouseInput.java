package FormyProject;

        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.By;

public class KeyboardAndMouseInput {

    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Arkadiusz\\Documents\\Chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/keypress");

        WebElement name = driver.findElement(By.id("name"));
        name.click();
        name.sendKeys("John Doe");

        WebElement button = driver.findElement(By.id("button"));
        button.click();

        driver.quit();

    }

}