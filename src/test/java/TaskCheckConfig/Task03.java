package TaskCheckConfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task03 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com"); // Otwórz Google
        Thread.sleep(2000);
        driver.get("https://coderslab.pl/pl"); // Otwórz CodersLab
        Thread.sleep(2000);
//        driver.navigate().back(); // Cofnij do Google
//        driver.navigate().back(); // Cofnij do Google
        driver.navigate().to("https://google.com");
        Thread.sleep(2000);
        driver.get("https://prod-kurs.coderslab.pl/index.php"); // Otwórz prod-kurs
        Thread.sleep(2000);
        driver.navigate().back(); // Cofnij do Google
        Thread.sleep(2000);
        driver.navigate().forward(); // Powróć do prod-kurs
        Thread.sleep(2000);
        driver.navigate().refresh(); // Odśwież prod-kurs
        Thread.sleep(2000);
        driver.quit();


        driver.quit();

    }
}
