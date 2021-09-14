import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task10 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //Wejdź na stronę główną.
        driver.get("https://prod-kurs.coderslab.pl/index.php");
        //kliknięcie w Sign In
        WebElement signIn = driver.findElement(By.cssSelector("span.hidden-sm-down"));
        signIn.click();
        //Wybierz opcję 'No account? Create on here'
        WebElement noAccount = driver.findElement(By.cssSelector("div.no-account"));
        noAccount.click();

        Thread.sleep(2000);
        //Za pomocą metod nawigacyjnych przejdź do strony głównej.
        driver.navigate().to("https://prod-kurs.coderslab.pl/index.php");
        driver.quit();
    }

}
