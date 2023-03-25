import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubmittingForm extends BaseSeleniumPage {

    public SubmittingForm() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//td[text()=\"Student Name\"]/following::td[1]")
    private WebElement studentName;


    @FindBy(xpath = "//td[text()=\"Student Email\"]/following::td[1]")
    private WebElement studentEmail;

    @FindBy(xpath = "//td[text()=\"Gender\"]/following::td[1]")
    private WebElement gender;

    @FindBy(xpath = "//td[text()=\"Mobile\"]/following::td[1]")
    private WebElement mobile;

    @FindBy(xpath = "//td[text()=\"Date of Birth\"]/following::td[1]")
    private WebElement dateOfBirth;

    @FindBy(xpath = "//td[text()=\"Subjects\"]/following::td[1]")
    private WebElement subjects;

    @FindBy(xpath = "//td[text()=\"Hobbies\"]/following::td[1]")
    private WebElement hobbies;

    @FindBy(xpath = "//td[text()=\"Picture\"]/following::td[1]")
    private WebElement picture;

    @FindBy(xpath = "//td[text()=\"Address\"]/following::td[1]")
    private WebElement address;

    @FindBy(xpath = "//td[text()=\"State and City\"]/following::td[1]")
    private WebElement stateAndCity;


    public String getStudentName() {
        return studentName.getText();
    }

    public String getStudentEmail() {
        return studentEmail.getText();
    }

    public String getGender() {
        return gender.getText();
    }

    public String getMobile() {
        return mobile.getText();
    }

    public String getDateOfBirth() {
        return dateOfBirth.getText();
    }

    public String getSubjects() {
        return subjects.getText();
    }

    public String getHobbies() {
        return hobbies.getText();
    }

    public String getPicture() {
        return picture.getText();
    }

    public String getAddress() {
        return address.getText();
    }

    public String getStateAndCity() {
        return stateAndCity.getText();
    }

}
