package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_Locators {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");
        //Amazonda nutella arat
        // WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        // aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);   // id unıque oldugu için bu sorunsuz calısır
        // WebElement aramaKutusu = driver.findElement(By.name("field-keywords"));
        // aramaKutusu.sendKeys("Nutella", Keys.ENTER); // name unıque oldugu için bu sorunsuz calısır
        // WebElement aramaKutusu = driver.findElement(By.className("nav-search-field ")); hata verdi
        // aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
    /*
    bu locator calismadi
    Locator alirken gozumuzden kacan detaylar olabilir
    aldigimiz bir locator calismazsa alternatif locatorlar denemeliyiz
     */
        driver.findElement(By.linkText("Become an Affiliate")).click(); //
        driver.findElement(By.partialLinkText("oducts on Amazon")).click(); // a tag ındaki link isminden istediğimiz bir parcayla locate edebiliriz



    }
}
