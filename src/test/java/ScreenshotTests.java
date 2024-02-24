import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotTests {


    WebDriver driver;

    @Test
    void test() throws InterruptedException, IOException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://automationtesting.co.uk/index.html");

        takeSnapShot(driver);



    }

    public static void takeSnapShot(WebDriver webdriver) throws IOException {
        File srcFile= ((TakesScreenshot)webdriver).getScreenshotAs(OutputType.FILE);

        File destFile= new File("C:\\Users\\alanu\\OneDrive\\Masaüstü\\screenshots\\" + timestamp() +".png");

        FileUtils.copyFile(srcFile,destFile);
    }
    public static String timestamp(){
        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
    }
}
