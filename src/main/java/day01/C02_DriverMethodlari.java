package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();

        // Amazon sayfasına gidiniz
        // Kaynak kodların içinde "Gateway" kelisinin olduğunu test ediniz
        // sayfayı kapatıniz

        if (driver.getPageSource().contains("Gateway")){
            System.out.println("test PASSED");
        }else {
            System.out.println("test FAILD");
        }
        driver.close();

    }
}
