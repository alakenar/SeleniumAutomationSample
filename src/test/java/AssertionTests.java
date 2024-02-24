import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AssertionTests {

    WebDriver driver;

    @Test
    void test() throws InterruptedException {
        driver= new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://automationtesting.co.uk");

        WebElement element=  driver.findElement(By.linkText("TEST STORE"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();

        driver.findElement(By.cssSelector("[alt='Hummingbird printed t-shirt']")).click();
        driver.findElement(By.cssSelector(".add-to-cart")).click();
        Thread.sleep(2000);
        String total= driver.findElement(By.cssSelector(".product-total > .value")).getText();

        Assert.assertEquals("$26.12",total);





    }
}
