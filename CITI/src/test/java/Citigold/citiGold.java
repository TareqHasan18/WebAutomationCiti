package Citigold;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class citiGold extends CommonAPI {

    @Test
    public void search() {
        driver.findElement(By.id("citigold")).click();
    }
}
