import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FirstTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Webdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://a.testaddressbook.com/sign_in");
        driver.findElement(By.id("user-name")).sendKeys(CharSequence..keysToSend:"sd@gmail.com");
        driver.findElement(By.name("password")).sendKeys(CharSequence..keysToSend:"xcv");
        driver.findElement(By.cssSelector("input[value='Login']")).click();
        driver.findElement(By.xpath("//option[@value='hilo']")).click();

        Thread.sleep(millis: 5000);
       // driver.close();
        driver.quit();
    }
}
