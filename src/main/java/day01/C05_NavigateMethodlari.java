package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_NavigateMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/main/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();

        // driver.navigate().to() methodu ileri geri yapilacak olursak kullanilir
        // driver.get() methodu gibi bizi istedigimiz url ye goturur

        driver.navigate().to("https://www.techproeducation.com");

        // tekrar amazon sayfasina donelim

        Thread.sleep(3000);
        driver.navigate().back();

        // tekrar techproed sayfasina gidelim
        Thread.sleep(3000);
        driver.navigate().forward();

        // techpro sayfasini yenileyelim
        Thread.sleep(3000);
        driver.navigate().refresh();

        // son olarak sayfayi kapatalim
        driver.close();


    }
}
