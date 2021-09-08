import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task07 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qloapps.coderslab.pl/en/");

        WebElement signIn = driver.findElement(By.className("user_login"));
        signIn.click();

        WebElement emailAddress = driver.findElement(By.className("account_input"));
        WebElement create = driver.findElement(By.id("SubmitCreate"));
        emailAddress.sendKeys("tes1t@tes212t.com");
        create.click();

        // Gdy musimy zaczekąć aż coś się załaduje lub zmieni wartość na stronie, preferowane jest użycie WebDriverWait
        // zamiast Thread.sleep. WebDriverWait będzie czekał tylko do momentu aż podany warunek się spełni, czyli nawet
        // jeśli ustawimy timeout na 30s, może przerwać po 100ms jeśli wykrył, że warunek jest spełniony; natomiast
        // Thread.sleep wymusza czekanie dokładnie takiej ilości czasu jaką mu określimy bez możliwości wcześniejszego wyjścia.
        // Generalnie chcemy by test automatyczny trwał jak najkrócej, więc będziemy dążyć do skrócenia czasu wykonania
        // gdziekolwiek się da - w tym przypadku unikając ustawiania stałych wartości oczekiwania, a dodając oczekiwanie
        // na konkretny warunek.
        // Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"customer_firstname\"]")));

        WebElement firstName = driver.findElement(By.xpath("//input[@name=\"customer_firstname\"]"));
        WebElement lastName = driver.findElement(By.xpath("//input[@id=\"customer_lastname\"]"));
        WebElement email = driver.findElement(By.xpath("//input[@name=\"email\"]"));
        WebElement password = driver.findElement(By.xpath("//input[@id=\"passwd\"]"));
        WebElement registerButton = driver.findElement(By.xpath("//button[@name=\"submitAccount\"]"));

        firstName.sendKeys("Włądek");
        lastName.sendKeys("xxx");
        email.clear();
        email.sendKeys("tesxxt@texxst.com");
        password.sendKeys("test123test");
        registerButton.click();

        driver.quit();
    }

}


