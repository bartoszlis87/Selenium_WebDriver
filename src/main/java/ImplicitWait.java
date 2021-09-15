import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWait {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        ImplicitlyWait(driver);

    }

    static void ImplicitlyWait(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//sposób na timout działa z findElement

        driver(driver);
    }

    static void driver(WebDriver driver) {
        driver.get("https://qloapps.coderslab.pl/en/");

        WebElement hotelLocation = driver.findElement(By.name("hotel_location"));
        WebElement searchButton = driver.findElement(By.name("search_room_submit"));
        WebElement newsletter = driver.findElement(By.name("email"));
        WebElement subscribeButton = driver.findElement(By.name("submitNewsletter"));

        hotelLocation.sendKeys("Warsaw");
        newsletter.sendKeys("test@test.com");

        driver.quit();
    }

}
