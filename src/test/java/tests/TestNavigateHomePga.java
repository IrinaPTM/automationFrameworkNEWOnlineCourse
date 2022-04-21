package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;

public class TestNavigateHomePga extends TestInit {

    @Test
    public void checkHomePageNavigation() {
        HomePage homePage = new HomePage(driver);
        homePage.navigate();

        Assert.assertTrue(homePage.getLogo().isDisplayed());
        Assert.assertTrue(homePage.getSignInBtn().isDisplayed());
        Assert.assertTrue(homePage.getSearchInput().isDisplayed());
        Assert.assertTrue(driver.getTitle().contains("Food"));
    }
}

