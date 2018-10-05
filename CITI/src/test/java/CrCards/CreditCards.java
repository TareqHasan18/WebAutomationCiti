package CrCards;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreditCards extends CommonAPI {

    @Test
    public void crCards(){
        driver.findElement(By.linkText("Credit Cards")).click();
    }
}
