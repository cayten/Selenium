package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // 1.Yeni bir class olusturalim (Homework)
        //        2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) "facebook"
        //        oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.navigate().to("https://www.facebook.com");
        if (driver.getTitle().contains("facebook")) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("Baslik :" + driver.getTitle());
        }
        //        3.Sayfa URL'inin "facebook" kelimesi icerdigini dogrulayin, icermiyorsa "actual" URL'i
        //        yazdirin.
        if (driver.getCurrentUrl().contains("facebook")) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("URL imiz :" + driver.getCurrentUrl());
        }
        //        4.https://www.walmart.com/ sayfasina gidin.
        driver.navigate().to("https://www.walmart.com/");
        //        5. Sayfa basliginin "Walmart.com" icerdigini dogrulayin.
        if (driver.getTitle().contains("Walmart.com")) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
        }
        //        6. Tekrar "facebook" sayfasina donun
        driver.navigate().back();
        //        7. Sayfayi yenileyin
        driver.navigate().refresh();
        //        8. Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();
        //        9.Browser'i kapatin
        driver.close();
    }
}