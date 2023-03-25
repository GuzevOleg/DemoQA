import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;


public class MainPage extends BaseSeleniumPage {

    @FindBy(id = "firstName")
    private WebElement firstNameElement;

    @FindBy(id = "lastName")
    private WebElement lastNameElement;

    @FindBy(id = "userEmail")
    private WebElement userEmailElement;

    private By genderElement = By.xpath(".//label[@for=\"gender-radio-1\"]");
    private By pictureElement = By.xpath(".//input[@type='file']");
    private By hobbiesElement = By.id("hobbies-checkbox-2");
    @FindBy(id = "userNumber")
    private WebElement userModileElement;

    @FindBy(id = "dateOfBirthInput")
    private WebElement dateOfBirthElement;

    @FindBy(xpath = "//div[@class=\"subjects-auto-complete__option subjects-auto-complete__option--is-focused css-1n7v3ny-option\"]")
    private WebElement subjectsEnglishElement;

    @FindBy(id = "subjectsInput")
    private WebElement userSubjectsElement;

    @FindBy(id = "currentAddress")
    private WebElement currentAddressElement;

    @FindBy (id="state")
    private WebElement stateElement;

    @FindBy (id="city")
    private WebElement cityElement;

    @FindBy (id="react-select-3-option-1")
    private WebElement menuStateElement;

    @FindBy (id="react-select-4-option-1")
    private WebElement menuCityElement;

    @FindBy (id="submit")
    private WebElement buttonSubmit;

//    @FindBy(xpath = "//div[@class=\"modal-dialog modal-lg\"]")
//    private WebElement modalPageElement;

    private By modalPageElement = By.xpath("//div[@class=\"modal-dialog modal-lg\"]");




    public MainPage() {
        driver.get("https://demoqa.com/automation-practice-form");
        PageFactory.initElements(driver, this);
    }

    public MainPage enterInfoPerson(String name, String lastName, String email, String mobile) {
        firstNameElement.click();
        firstNameElement.sendKeys(name);
        lastNameElement.click();
        lastNameElement.sendKeys(lastName);
        userEmailElement.click();
        userEmailElement.sendKeys(email);
        userModileElement.click();
        userModileElement.sendKeys(mobile);
        return this;
    }

    public MainPage enterGender() {
        driver.findElement(genderElement).click();
        return this;
    }

    public MainPage enterBirthDate(String date) {
        dateOfBirthElement.click();
        dateOfBirthElement.sendKeys(Keys.HOME, Keys.SHIFT, Keys.END);
        dateOfBirthElement.sendKeys(date, Keys.ENTER);
        return this;
    }

    public MainPage enterSubjects(String text) {
        userSubjectsElement.click();
        userSubjectsElement.sendKeys(text);
        subjectsEnglishElement.click();
        return this;
    }

    public MainPage enterHobbies() {
        WebElement element = driver.findElement(hobbiesElement);
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.click();
        actions.build().perform();
        return this;
    }

    public MainPage enterPicture() {
        String path = "src/main/resources/test.jpg";
        File file = new File(new File(path).getAbsolutePath());
        driver.findElement(pictureElement).sendKeys(file.getAbsolutePath());
        return this;
    }

    public MainPage enterCurrentAddress(String currentAddressText) {
        currentAddressElement.click();
        currentAddressElement.sendKeys(currentAddressText);
        return this;
    }
    public MainPage enterState ()  {
        stateElement.click();
        menuStateElement.click();
        return this;

    }

    public MainPage enterCity () {
        cityElement.click();
        menuCityElement.click();
        return this;
    }
    public SubmittingForm openSubmittingForm(){
        buttonSubmit.click();
        return new SubmittingForm();
    }

//    public Boolean isOpenedModalPage(){
//        return isElementPresent(modalPageElement);
//
//    }


}
