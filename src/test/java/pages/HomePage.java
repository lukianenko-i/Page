package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public WebDriver driver;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    /**
     * определение локатора кнопки окна входа
     */
    @FindBy(xpath = "/html/body/app-root/div/div/rz-header/rz-main-header/header/div/div/ul/li[3]/rz-user/button")
    private WebElement userWindowEnter;

    /**
     * определение локатора кнопки входа
     */
    @FindBy(xpath = "/html/body/app-root/rz-single-modal-window/div[3]/div[2]/rz-user-identification/rz-auth/div/form/fieldset/div[5]/button[1]")
    private WebElement userEnter;

    /**
     * определение локатора поля логина
     */
    @FindBy(xpath = "//*[@id='auth_email']")
    private WebElement userLogin;

    /**
     * определение локатора поля пароля
     */
    @FindBy(xpath = "//*[@id=\"auth_pass\"]")
    private WebElement userPassword;


    /**
     * определение локатора кнопки меню
     */
    @FindBy(xpath = "/html/body/app-root/div/div/rz-header/rz-main-header/header/div/div/rz-mobile-user-menu/button")
    private WebElement clickMenu;

    /**
     * определение локатора кнопки акаунта пользователя
     */
    @FindBy(xpath = "//*[@id=\"cdk-overlay-2\"]/nav/div/div[2]/div[1]")
    private WebElement clickUserPage;


    /**
     * метод для нажатия кнопки окна входа
     */
    public HomePage clickUserWindowEnter() {
        userWindowEnter.click();
        return this;
    }

    /**
     * метод для ввода логина
     */
    public HomePage enterUserLogin(String login) {
        userLogin.sendKeys(login);
        return this;
    }

    /**
     * метод для ввода пароля
     */
    public HomePage enterUserPassword(String password) {
        userPassword.sendKeys(password);
        return this;

    }


    /**
     * метод для нажатия кнопки  входа
     */
    public HomePage clickUserEnter() {
        userEnter.click();
        return this;
    }

    /**
     * метод для нажатия кнопки  меню
     */
    public HomePage clickMenu() {
        clickMenu.click();
        return this;
    }

    /**
     * метод для нажатия кнопки  перехода на акаунт пользователя
     */
    public HomePage clickUserPage() {
        clickUserPage.click();
        return this;
    }


}
