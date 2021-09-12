import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class Task09 {



    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qloapps.coderslab.pl/en/");

        WebElement signIn = driver.findElement(By.className("user_login"));
        signIn.click();

        // Ponieważ wartość email będzie używana parokrotnie w kodzie, wydzieliłam ją do osobnej zmiennej.
        String email = "test@test.com";

        WebElement emailAddress = driver.findElement(By.className("account_input"));
        WebElement create = driver.findElement(By.id("SubmitCreate"));
        emailAddress.sendKeys(email);
        create.click();

        // Jeśli to samo 'By' musimy przekazać w wielu miejscach w teście (np. do Wait i potem do wyszukania danego
        // elementu już jako WebElement), można je wydzielić do osobnej zmiennej.
        // Użycie: linijka 38 i 40.
        By firstNameSelector = By.xpath("//input[@name='customer_firstname']");
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameSelector));

        WebElement firstName = driver.findElement(firstNameSelector);
        WebElement lastName = driver.findElement(By.xpath("//input[@id='customer_lastname']"));
        WebElement emailInput = driver.findElement(By.xpath("//input[@name='email']"));
        WebElement password = driver.findElement(By.xpath("//input[@id='passwd']"));
        WebElement registerButton = driver.findElement(By.xpath("//button[@name='submitAccount']"));

        if (firstName.isDisplayed()) {
            firstName.sendKeys("Bartek");
        } else {
            Assert.fail();
        }

        if (lastName.isDisplayed()) {
            lastName.sendKeys("XXX");
        } else {
            Assert.fail();
        }

        if (emailInput.isDisplayed() && !emailInput.getText().equals(email)) {
            emailInput.clear();
            emailInput.sendKeys(email);
        } else if (!emailInput.isDisplayed()) {
            Assert.fail();
        }

        if (password.isDisplayed()) {
            password.sendKeys("test11test");
        } else {
            Assert.fail();
        }

        if (registerButton.isEnabled()) {
            registerButton.click();
        } else {
            Assert.fail();
        }

        WebElement myInformation = driver.findElement(By.cssSelector("a[title='Information']"));
        // Przykład wykorzystania metody isDisplayed() w asercji.
        // Jeśli element jest wyświetlony, test jest zaliczony. Jeśli nie, sfailowany.
        assertTrue(myInformation.isDisplayed());
        driver.quit();

    }
}
