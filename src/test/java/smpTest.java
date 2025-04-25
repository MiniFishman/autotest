import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class smpTest
{
    static WebDriver driver;

    @Test
    public void addUser()
    {
        WebDriverManager.chromedriver().browserVersion("135.0.7049.115").setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //открытие сайта
        driver.get("http://213.189.216.137:8080/");

        //авторизация
        driver.findElement(By.id("username")).sendKeys("user17");
        driver.findElement(By.id("password")).sendKeys("zxsderZ_56");
        driver.findElement(By.xpath("//input[@id='submit-button']")).click();

        //переход во вклалку Автотесты
        driver.findElement(By .xpath("//a[contains(text(),'Autotesting')]")).click();

        //нажать на кнопку "Избранное"
        driver.findElement(By .xpath("//div[@id='gwt-debug-favorite']")).click();

        //сохранить
        driver.findElement(By.xpath("//div[@id='gwt-debug-apply']")).click();

        //открыть сохраннеую карточку
        driver.findElement(By.xpath("//a[@id='gwt-debug-title']/div")).click();







    }

    /*@AfterAll
    public static void closeSite()
    {
        driver.close();
    }*/
}
