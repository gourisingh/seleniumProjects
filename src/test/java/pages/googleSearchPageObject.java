package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class googleSearchPageObject {
    By text_box= By.id("APjFqb");

    By button_search = By.name("btnk");

    public googleSearchPageObject(WebDriver driver)
    {
        this.driver = driver;

    }

    WebDriver driver = null;

    public void setTextInSearchBox(String text){

        driver.findElement(text_box).sendKeys(text);

    }

    public void clickSearchButton(){

        driver.findElement(button_search).sendKeys(Keys.RETURN);

    }

}
