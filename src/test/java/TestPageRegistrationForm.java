import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class TestPageRegistrationForm extends BaseSeleniumTest  {



    @Test
    public void checkingFillingAllRegistrationForm(){

        SubmittingForm submittingForm = new MainPage()
                .enterInfoPerson(TestValues.TEST_NAME,TestValues.TEST_LASTNAME,TestValues.TEST_EMAIL,TestValues.TEST_MOBILE)
                .enterGender()
                .enterHobbies()
                .enterBirthDate(TestValues.TEST_BIRTHDATE)
                .enterSubjects(TestValues.TEST_SUBJECTS)
                .enterPicture()
                .enterState()
                .enterCurrentAddress(TestValues.TEST_ADDRESS)
                .enterCity().
                openSubmittingForm();


        Assert.assertEquals(submittingForm.getMobile(),TestValues.TEST_MOBILE);
        Assert.assertEquals(submittingForm.getStudentName(),TestValues.TEST_studentName);
        Assert.assertEquals(submittingForm.getStudentEmail(),TestValues.TEST_EMAIL);
        Assert.assertEquals(submittingForm.getDateOfBirth(),TestValues.TEST_BIRTHDATE);
        Assert.assertEquals(submittingForm.getGender(),TestValues.TEST_GENDER);
        Assert.assertEquals(submittingForm.getSubjects(),TestValues.TEST_SUBJECTS);
        Assert.assertEquals(submittingForm.getAddress(),TestValues.TEST_ADDRESS);
        Assert.assertEquals(submittingForm.getHobbies(),TestValues.TEST_HOBBIES);
        Assert.assertEquals(submittingForm.getPicture(),TestValues.TEST_PICTURE);
        Assert.assertEquals(submittingForm.getStateAndCity(),TestValues.TEST_STATE_AND_CITY);

    }



}