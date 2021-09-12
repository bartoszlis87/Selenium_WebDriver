import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task08 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qloapps.coderslab.pl/en/");

        WebElement signIn = driver.findElement(By.className("user_login"));

        // Przykłady pobierania wartości z elementu typu: tekst, atrybut, tag
        System.out.println(signIn.getText());
        System.out.println(signIn.getAttribute("title"));
        System.out.println(signIn.getTagName());
        // Można przypisywać pobrane wartości do zmiennych i użyć ich później w teście
        String text = signIn.getText();

        signIn.click();

        WebElement emailAddress = driver.findElement(By.className("account_input"));
        WebElement create = driver.findElement(By.id("SubmitCreate"));
        emailAddress.sendKeys("te12st@test.com");
        create.click();

        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"customer_firstname\"]")));

        // Jeśli wklejamy tekst z cudzysłowami do Stringa, należy je poprzedzić ukośnikiem \"
        // W innym wypadku Java pomyśli, że zakończyliśmy String przedwcześnie.
        // Można zamiast tego użyć apostrofu.
        WebElement firstName = driver.findElement(By.xpath("//input[@name=\"customer_firstname\"]"));
        WebElement lastName = driver.findElement(By.xpath("//input[@id='customer_lastname']"));
        WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
        WebElement password = driver.findElement(By.xpath("//input[@id=\"passwd\"]"));
        WebElement registerButton = driver.findElement(By.xpath("//button[@name=\"submitAccount\"]"));

        firstName.sendKeys("Władek");
        lastName.sendKeys("Gad");
        email.clear();
        email.sendKeys("te1st@t1est.com");
        password.sendKeys("testt111est");
        registerButton.click();

        WebElement myAddresses = driver.findElement(By.cssSelector("a[href=\"https://qloapps.coderslab.pl/en/addresses\"]"));
        WebElement myInformation = driver.findElement(By.cssSelector("a[title=\"Information\"]"));

        driver.quit();


    }

}
