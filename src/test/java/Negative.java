import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Negative extends Base {

    @Test
    public void practiceTest() throws InterruptedException {
        // Стандартная чатсь верх

//стандартная часть
        // начало теста
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(3000);
//Проверка открылась нужная страница
        String titleActual = driver.getTitle();
        String titleExpected = "Swag Labs";

        Assert.assertEquals(titleActual, titleExpected);


//вод логина и пароля
       WebElement userName = driver.findElement(By.id("user-name"));
      userName.sendKeys("test@test.com");
        Thread.sleep(1000);

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("pass123");
       Thread.sleep(1000);


        WebElement LoginButton = driver.findElement(By.id("login-button"));
        LoginButton.click();
        Thread.sleep(1000);
//извлечение текста из элемента на странице
        WebElement errorMessage = driver.findElement(By.xpath("//h3[@data-test='error']"));
        String actualTexMessange = errorMessage.getText();
        System.out.println(actualTexMessange);
         String expectedMessage = "Epic sadface: Username and password do not match any user in this service";
         Assert.assertEquals(actualTexMessange,expectedMessage);
         System.out.println("Текст сооющение об ошибки проверен");
         driver.quit();

    }
}

