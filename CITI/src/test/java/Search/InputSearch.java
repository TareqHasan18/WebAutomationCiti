package Search;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class InputSearch extends CommonAPI {

    @Test
    public void search() {
        driver.findElement(By.id("personetics-citi-menu")).click();
    }


}
