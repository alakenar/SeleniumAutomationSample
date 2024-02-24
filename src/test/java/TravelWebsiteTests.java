import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TravelWebsiteTests {

    WebDriver driver;

    @Test
    void test() throws InterruptedException {
        driver= new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://ebilet.tcddtasimacilik.gov.tr/view/eybis/tnmGenel/tcddWebContent.jsf");

        driver.findElement(By.cssSelector("#nereden")).sendKeys("istanbul");
        Thread.sleep(1000);
        List<WebElement> origins = driver.findElements(By.cssSelector("body > ul:nth-of-type(1)"));


        for(WebElement origin:origins){
            if(origin.getText().contains("Halkalı")){
                origin.click();

            }
        }

        driver.findElement(By.cssSelector("#nereye")).sendKeys("izmir");
        Thread.sleep(1000);
        List<WebElement> destinations = driver.findElements(By.cssSelector("body > ul:nth-of-type(2)"));

        for(WebElement destination:destinations){
            if(destination.getText().contains("Basmane")){
                destination.click();
            }
        }


    }
}
