
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

abstract class BaseSeleniumPage {
    protected  static  WebDriver driver;

    public static void setDriver(WebDriver webDriver){
        driver= webDriver;
    }

//    public boolean isElementPresent(By by){
//        try {
//            driver.findElement(by);
//            return true;
//        } catch (NoSuchElementException e){
//            return false;
//        }
//    }
}
