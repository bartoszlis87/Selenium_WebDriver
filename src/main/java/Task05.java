import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task05 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
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

