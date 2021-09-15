import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Task11 {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver",
                "src/main/resources/drivers/geckodriver");

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//sposób na timout
        driverGetAdress(driver);


    }

    static void driverGetAdress(WebDriver driver) {
        driver.get("https://www.google.com");
        WebElement button = driver.findElement(By.id("L2AGLb"));
        button.click();
        WebElement element = driver.findElement(By.name("q"));
        element.clear();
        element.sendKeys("Najlesze miejsca w Lublinie");
        element.submit();
    }

}
