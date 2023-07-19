package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_ManageMethodlari {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.techproeducation.com");
        driver.close();
        /*
İleride wait  konusunu daha geniş olarak ele alacağız
Bir sayfa açılırken,ilk başta sayfanın içerisinde bulunan elementlere göre bir yükleme
süresine ihtiyaç vardır veya bir web elementin kullanılabilmesi için zamana ihtiyaç olabilir
implicitlyWait bize sayfanın yüklenmesi ve sayfadaki elementlere ulaşım için beklenecek
MAXIMUM süreyi belirleme olanağı tanır
 */
    }
}