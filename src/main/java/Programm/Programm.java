package Programm;

import java.time.Duration;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class FirstTest {
    public FirstTest() {
    }

    @Test
    public void firstTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:/Automated Testing/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10L));
        driver.manage().window().maximize();
        driver.get("https://www.onliner.by");
        Thread.sleep(5000L);
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys(new CharSequence[]{"Java language"});
        Thread.sleep(3000L);
        element.submit();
        System.out.println(driver.getTitle());
    }
}
