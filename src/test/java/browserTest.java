import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.Set;

public class browserTest {

     public static void main(String[] args) {

//         WebDriver driverFirefox = new FirefoxDriver();
//         driverFirefox.get("https://www.selenium.dev/");

         WebDriver driverChrome = new ChromeDriver();
         driverChrome.get("https://www.selenium.dev/");
     }
}
