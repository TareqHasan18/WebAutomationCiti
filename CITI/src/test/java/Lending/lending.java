package Lending;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class lending extends CommonAPI {
    @Test
    public void crCards(){
        driver.findElement(By.linkText("Lending")).click();
    }
}
