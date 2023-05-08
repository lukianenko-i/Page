package tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import pages.HomePage;

import pages.UserPage;
import utils.ConfProperties;


public class LoginTest extends BaseTest {


    @Test
    @DisplayName("Тест входа и вихода в акаунт")
    public void checkLoginPositive() {


        new HomePage(driver)
                .clickUserWindowEnter()
                .enterUserLogin(ConfProperties.getProperty("login"))
                .enterUserPassword(ConfProperties.getProperty("password"))
                .clickUserEnter()
                .clickMenu().
                clickUserPage();
        new UserPage(driver)
                .clickUserExit();

        String user = String.valueOf(new UserPage(driver)
                .getUserMail());
        Assert.assertEquals(ConfProperties.getProperty("login"), user);


        //TODO assert
    }
}
