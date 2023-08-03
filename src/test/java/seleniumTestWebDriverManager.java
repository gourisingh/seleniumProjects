import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumTestWebDriverManager {
    public static void main(String[] arg){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
        WebElement textBox = driver.findElement(By.id("APjFqb"));
         textBox.sendKeys("testing");

        //use xpath
        WebElement element = driver.findElement(new By.ByXPath("//input[@id='APjFqb']"));
        element.sendKeys("testing");

        // driver.quit();
       // driver.close();

    }

}
