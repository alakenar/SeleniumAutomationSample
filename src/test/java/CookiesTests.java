import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesTests {

    WebDriver driver;
    @Test
    void test() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://teststore.automationtesting.co.uk/");
        driver.manage().window().maximize();


        driver.findElement(By.cssSelector("#_desktop_user_info")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("section input[name='email']")).sendKeys("test@test.com");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("[name='password']")).sendKeys("test123");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button#submit-login")).click();
        Thread.sleep(1000);
        driver.findElement(By.linkText("CLOTHES")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("img[alt='Hummingbird printed t-shirt']")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".add-to-cart.btn.btn-primary")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".btn.btn-secondary")).click();
        Thread.sleep(2000);

        driver.manage().deleteAllCookies();

    }

}
