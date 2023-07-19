package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/main/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //        a. https://www.heroku.com/home adresine gidiniz.
        driver.get("https://www.heroku.com/home");
        //        b. Sign up butonuna basin
        WebElement signUp=driver.findElement(By.linkText("Sign Up"));
        signUp.click();
        //        c. Firstname textbox,Lastname textbox,company and signin button elementlerini locate ediniz..
        WebElement firstName=driver.findElement(By.id("first_name"));
        WebElement lastName=driver.findElement(By.id("last_name"));
        WebElement email=driver.findElement(By.id("email"));
        WebElement company=driver.findElement(By.id("company"));
        WebElement signUpButton=driver.findElement(By.name("commit"));
        firstName.sendKeys("Cuneyt");
        lastName.sendKeys("soylu");
        email.sendKeys("email@gmail.com");
        company.sendKeys("ccs");
        signUpButton.click();
    }
}
