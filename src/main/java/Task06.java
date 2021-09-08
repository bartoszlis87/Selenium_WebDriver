import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task06 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qloapps.coderslab.pl/en/");

        WebElement signIn = driver.findElement(By.className("user_login"));
        signIn.click();

        // W tym przypadku znalezione zostaną 3 elementy, ale zwrócony będzie pierwszy.
        // Aby znalazł jeden element lepiej użyć w tym przypadku id: By.id("email_create")
        WebElement emailAddress = driver.findElement(By.className("account_input"));
        WebElement create = driver.findElement(By.id("SubmitCreate"));
        emailAddress.sendKeys("test@test.com");
        create.click();

        driver.quit();
    }

}
