package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class C05 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/sources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //Amazon sayfasına gidiniz
        driver.get("https://amazon.com");
        //Amazon sayfasındaki tagların  (a) olanların sayısını yazdırın
        List<WebElement> tag =driver.findElements(By.tagName("a"));
        System.out.println("A tag inin sayisi "+tag.size());
        //Amazon sayfasındaki tagların  (a) olanların sayısını yazdırın
        List<WebElement> tag1=driver.findElements(By.tagName("input"));
        System.out.println("Input tag inin sayisi "+tag1.size());
    }
}
