package TaskCheckConfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task02 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://coderslab.pl/pl");
        driver.get("https://prod-kurs.coderslab.pl/index.php");
        driver.get("https://qloapps.coderslab.pl/en/");
        driver.quit();

    }
}
