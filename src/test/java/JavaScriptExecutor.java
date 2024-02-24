import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

    WebDriver driver;

    @Test
    void test() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://automationtesting.co.uk/contactForm.html");

        driver.findElement(By.cssSelector("input[name='first_name']")).sendKeys("meric");
        driver.findElement(By.cssSelector("input[name='last_name']")).sendKeys("güller");
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("mguller@gmail.com");
        driver.findElement(By.cssSelector("textarea")).sendKeys("alaya cok asigim");


        WebElement submit = driver.findElement(By.cssSelector("[type='submit']"));
        WebElement reset= driver.findElement(By.cssSelector("[type='reset']"));


        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click(),arguments[1].click()", reset,submit);


    }
}