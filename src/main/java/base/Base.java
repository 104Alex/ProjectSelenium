package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class Base {

    //String homePath = "C:/selenium/chromedriver.exe";
    String workPath = "D:\\123/chromedriver.exe";

    public static WebDriver driver;

    @BeforeTest
    public void initializeDriver() {
        System.setProperty("webdriver.chrome.driver", workPath);
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @AfterTest
    public void endTest() {
        driver.quit();
    }

    //ПРОВЕРКА ЧТО ОТКРЫЛАСЬ НУЖНАЯ СТРАНИЦА
    public static String checkTitle(String titleExpected) {
        String titleActual = driver.getTitle();
       // String titleExpected = "Swag Labs";

        Assert.assertEquals(titleActual, titleExpected);
        String result = "Заголовок страницы проверен";
        //System.out.println("Заголовок страницы проверен");
        return  result;
    }
}
