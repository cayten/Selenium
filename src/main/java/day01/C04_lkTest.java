package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_lkTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/main/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        /*
        1. Amazon sayfasina gidiniz
        2. Basligin "Amazon" icerdigini test ediniz
        3. Url nin amazon iceriginiz test ediniz
        4. Sayfayi kapatiniz
         */

        //1- Amazon sayfasina gidiniz
        driver.get("https://ww.amazon.com");
        //2-Basligin "Amazon" icerdigini test ediniz
        String actualTitle= driver.getTitle();
        String istenenKelime="Amazon";

        if (actualTitle.contains(istenenKelime)){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
        }
        //3- Url nin amazon iceriginiz test ediniz

        String actualUrl=driver.getCurrentUrl();
        String arananKelime="amazon";

        if (actualUrl.contains(arananKelime)){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
        }

        driver.manage().window().maximize();

        // 4- Sayfayi kapatiniz
        driver.close();



    }
}
