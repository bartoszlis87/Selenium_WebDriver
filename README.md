# Selenium_WebDriver

Zadania z kurs u Coders Lab. Pierwsza instalacja, konfiguracja do zadań.

1.Dodawanie Selenium: 3.141.59 stabilna wersja
https://mvnrepository.com/

```<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>3.141.59</version>
</dependency>
```
2. W projekcie dodajemy dependencies w pom
<dependency>
3. Dodajemy TasCheckConfig a w nim GoogleSearch

```
package TaskCheckConfig;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class GoogleSearch {


    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.clear();
        element.sendKeys("Coderslab");
        element.submit();
        driver.quit();
    }

}
```
4. Dodamejmy Maven properties
```
<properties>
        <maven.compiler.source>16</maven.compiler.source>
        <maven.compiler.target>16</maven.compiler.target>
    </properties>
```

5. Pobieramy sterownik do przeglądarki Chrome pod wersję swojej przeglądarki
`https://sites.google.com/a/chromium.org/chromedriver/downloads`

6. Tworzymy w main folder `src\main\resources\drivers` i tam dodajemy pobrany sterownik
