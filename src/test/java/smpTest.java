import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class smpTest
{
    WebDriver driver = new ChromeDriver();

    @Test
    public void addUser()
    {
        WebDriverManager.chromedriver().browserVersion("135.0.7049.115").setup();


        //открытие сайта
        driver.get("http://213.189.216.137:8080/");

        //авторизация
        driver.findElement(By.id("username")).sendKeys("user17");
        driver.findElement(By.id("password")).sendKeys("zxsderZ_56");
        driver.findElement(By.xpath("//input[@id='submit-button']")).click();
    }

    @AfterAll
    public static void closeSite()
    {
        
    }
}
