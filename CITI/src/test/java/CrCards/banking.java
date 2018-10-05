package CrCards;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class banking extends CommonAPI {

    @Test
    public void search() {
        driver.findElement(By.linkText("Credit Cards")).click();
        driver.findElement(By.id("banking")).click();
    }
}
