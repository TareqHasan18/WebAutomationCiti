package Banking;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class banking extends CommonAPI {

    @Test
    public void crCards(){
        driver.findElement(By.linkText("Banking")).click();
    }
}
