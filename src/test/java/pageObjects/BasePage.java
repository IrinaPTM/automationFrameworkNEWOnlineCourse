package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getEnv() {
        if (System.getProperty("env") == null) {
            return "https://qa2.eatstreet.com";
        } else {
            return "https://" + System.getProperty("env") + "eatstreet.com";
        }
    }

    public void sleep(int miliseconds) {
        try {
            Thread.sleep(miliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public WebElement getElementByXpath(String locator) {
        sleep(500);
        return driver.findElement(By.xpath(locator));

    }
}
