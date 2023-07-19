package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/main/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        // -Amazon sayfasına gidiniz
        driver.get("https://www.amazon.com.tr");
        //    -Arama kutusunu locate ediniz
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        //    -Arama kutusunun tagName'inin input olduğunu test ediniz
        String actualTagName=aramaKutusu.getTagName();
        String expectedTagName="input";
        if (actualTagName.contains(expectedTagName)){
            System.out.println("TEST PASSED");
        }else{
            System.out.println("TEST FAILED");
        }
        //    -Arama kutusunun name atributu'nun değerinin field-keywords olduğunu test ediniz
        String actualAttribute=aramaKutusu.getAttribute("name");
        String expectedAttribute="field-keywords";
        if (actualAttribute.contains(expectedAttribute)){
            System.out.println("TEST PASSED");
        }else{
            System.out.println("TEST FAILED");
        }
        //    -Sayfayı kapatınız
        driver.close();
    }}
