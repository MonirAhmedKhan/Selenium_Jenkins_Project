package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Base {
    public static WebDriver driver;


    public static void navigateURL(String URL){
        driver.get(URL);
    }

    public static void click(By locator) {
        driver.findElement(locator).click();
    }

    public static void sendKeys(By locator, String key) {
        driver.findElement(locator).sendKeys(key);
    }

    public static void selectDropDownMenu(By locator, String textToSelect) {
        Select dropDownWebElement;
        dropDownWebElement = new Select( driver.findElement( locator ) );
        dropDownWebElement.selectByVisibleText(textToSelect);

    }


    public static String getTextElement(By locator) {
        String text = driver.findElement(locator).getText();
        return text;
    }


    public  static int getTotalElementsCount(By locator){
    List <WebElement> webElements = driver.findElements(locator);
     int totalCount = webElements.size();
     return totalCount;
    }


}
