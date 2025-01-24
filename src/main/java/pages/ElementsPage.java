package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementsPage extends BasePage {

    public ElementsPage(WebDriver driver) {
        super(driver);
    }

    public void navigateToOption(String option) {
        driver.findElement(By.xpath("//span[text()='" + option + "']")).click();
    }
}
