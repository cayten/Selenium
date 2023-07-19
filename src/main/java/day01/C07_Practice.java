package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C07_Practice {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/main/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Yeni bir class olusturalim :

        //Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");

        //Sayfa basligini(title) yazdirin
        String title = driver.getTitle();
        System.out.println(title);

        //Sayfa basliginin “Amazon” icerdigini test edin
        String baslik = driver.getTitle();
        String istenenKelime = "Amazon";

        if (baslik.contains(istenenKelime)) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }

        //Sayfa adresini(url) yazdirin
        String url = driver.getCurrentUrl();
        System.out.println(url);

        //Sayfa url’inin “amazon” icerdigini test edin.
        String baslikUrl = driver.getCurrentUrl();
        String istenenUrl = "amazon";

        if (baslikUrl.contains(istenenUrl)) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }

        // Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandle());

        //Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        if (driver.getPageSource().contains("Gateway")) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }

        //Sayfayi kapatin.
        driver.quit();
    }


}

