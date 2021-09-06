import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task01 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        WebElement button = driver.findElement(By.id("L2AGLb"));
        button.click();
        WebElement element = driver.findElement(By.name("q"));
        element.clear();
        element.sendKeys("Najlesze miejsca w Lublinie");
        element.submit();
        driver.quit();
    }

}
