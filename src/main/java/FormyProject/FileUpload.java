package FormyProject;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class FileUpload {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arkadiusz\\Documents\\Chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/fileupload");

        WebElement fileUploadField = driver.findElement(By.id("file-upload-field"));
        fileUploadField.sendKeys("PUBLIC-HEALTH-COVID-PL.pdf");

        driver.quit();

    }

}
