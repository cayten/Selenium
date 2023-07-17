package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        System.out.println(driver.getCurrentUrl());//https://www.amazon.com/ -->Gidilen sayfanın Url'ini getirir
        System.out.println(driver.getTitle());//Amazon.com-->Gidilen sitenin başlığını yazdırır
        System.out.println(driver.getPageSource());//--> gidilen sayfanin kaynak kodlarini getirir
    }
}