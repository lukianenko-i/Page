package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {
    public WebDriver driver;

    public UserPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    /**
     * определение локатора кнопки вихода
     */
    @FindBy(xpath = "//*[@id=\"cabinet-content\"]/rz-cabinet-personal-information/rz-cabinet-account-actions/section/div/button[2]")
    private WebElement userExit;

    /**
     * определение локатора кнопки вихода
     */
    @FindBy(xpath = "//*[@id=\"cdk-overlay-2\"]/nav/div/div[2]/div[1]/a/div[2]/p")
    private WebElement userMail;

    /**
     * метод для нажатия кнопки  вихода из акаунта пользователя
     */
    public UserPage clickUserExit() {
        userExit.click();
        return this;
    }

    /**
     * метод для нажатия кнопки  вихода из акаунта пользователя
     */
    public UserPage getUserMail() {
        String userGMail = userMail.getText();
        return this;
    }


}
