package Search;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class EnterInput extends CommonAPI{
    @Test
    public void serarch(){
        driver.findElement(By.id("personetics-citi-menu")).click();
        driver.findElement(By.xpath("//*[contains(@class,'citi-autocomplete-content-searchbox-go')]")).click();
    }
}
