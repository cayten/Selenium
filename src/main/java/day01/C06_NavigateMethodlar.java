package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_NavigateMethodlar {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/main/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //Yeni bir Class olusturalim.

        //Youtube ana sayfasina gidelim . https://www.youtube.com/
        driver.get("https://www.youtube.com");

        //Amazon soyfasina gidelim. https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com");


        //Tekrar YouTube’sayfasina donelim
        driver.navigate().back();


        //Yeniden Amazon sayfasina gidelim
        driver.navigate().forward();

        //Sayfayi Refresh(yenile) yapalim
        driver.navigate().refresh();

        //Sayfayi kapatalim / Tum sayfalari kapatalim
        driver.quit();
    }
}
