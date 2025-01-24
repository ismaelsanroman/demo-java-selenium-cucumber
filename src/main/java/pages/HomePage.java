package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnSection(String section) {
        driver.findElement(By.xpath("//h5[text()='" + section + "']")).click();
    }
}
