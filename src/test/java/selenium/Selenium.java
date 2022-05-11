package selenium;

import base.Base;
import org.testng.annotations.Test;

public class SauceDemoPositiveLoginTest extends Base {
    @Test
    public void sauceDemoPositiveLoginTest() throws  InterruptedException {
        openPage();
        login();
    }
}

