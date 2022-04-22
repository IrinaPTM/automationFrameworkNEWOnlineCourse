package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;

public class TestSearch extends TestInit{

    @Test
    public void TestSearch (){
        HomePage homePage = new HomePage(driver);
        homePage.navigate();

        homePage.getSearchField().sendKeys("Chicago");
        homePage.getSearchImageBtn().click();
        Assert.assertTrue(homePage.getSearchField().isDisplayed());
    }
}
