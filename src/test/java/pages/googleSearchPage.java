package pages;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class googleSearchPage {

    private static WebElement element = null;

    public static WebElement textbox_search(WebDriver driver){

        element = driver.findElement(By.name("q"));
        return element;
   }

   public static WebElement button_seach(WebDriver driver){
        //not able to find btnk button
        //element = driver.findElement(By.name("btnK"));


       element = driver.findElement(By.name("q"));
        return element;

   }
}
