package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverManager;
import java.time.Duration;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage() {
        this.driver = DriverManager.getDriver();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void navigateToWeb(String url) {
        driver.get(url);
    }

    // Métodos de HomePage
    public void clickOnSection(String section) {
        driver.findElement(By.xpath("//h5[text()='" + section + "']")).click();
    }

    // Métodos de ElementsPage
    public void navigateToOption(String option) {
        driver.findElement(By.xpath("//span[text()='" + option + "']")).click();
    }
}
