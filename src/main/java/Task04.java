import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task04 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qloapps.coderslab.pl/en/");

        WebElement hotelLocation = driver.findElement(By.id("hotel_location"));
        WebElement newsletter = driver.findElement(By.id("newsletter-input"));
        WebElement searchButton = driver.findElement(By.id("search_room_submit"));

        hotelLocation.sendKeys("Lublin");
        Thread.sleep(3000);

        // Klasa Actions posiada zestaw dodatkowych akcji, które można wykorzystać w testach, np. najechanie na
        // element, double click, click and hold. Należy pamiętać o użyciu metody perform() na końcu. Inaczej akcje
        // się nie wykonają.
        Actions actions = new Actions(driver); // Utworzenie obiektu klasy Actions.
        actions.moveToElement(newsletter); // Dodanie przesunięcia kursora do elementu 'newsletter' jako akcję, którą chcemy wykonać.
        //        actions.doubleClick(); // Opcjonalnie dodanie kolejnych akcji.
        actions.perform(); // Wywołanie akcji, które dodaliśmy.
        // actions.moveToElement(newsletter).doubleClick().perform(); // Dodanie kolejnych akcji i ich wywołanie
        // można też zrobić w jednej linijce zakończonej metodą perform().

        newsletter.sendKeys("test@test.com");
        Thread.sleep(3000);

        driver.quit();
    }

}

