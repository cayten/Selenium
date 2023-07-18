package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_WindowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/main/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://ww.amazon.com");
        driver.manage().window().maximize();
        System.out.println(driver.getWindowHandle());// F805C047DD96865A225437FD940FAC3D
        // farkli pencereler arasinda gezinebilmek icin getWindowHandle() methodunu kullaniriz


    }
}
