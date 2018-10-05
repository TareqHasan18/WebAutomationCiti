package Investing;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class investing extends CommonAPI {
    @Test
    public void crCards(){
        driver.findElement(By.linkText("Investing")).click();
    }
}
