package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

public class googleSearchPageTest {

   private static WebDriver driver = null;

    public static void main(String[] args) throws InterruptedException {
        googleSearchTest();

    }

    public static void googleSearchTest() throws InterruptedException {

        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdirever.chrome.driver", projectPath +"/drivers/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        googleSearchPageObject searchPageObj = new googleSearchPageObject(driver);

        driver.get("https://google.com");
        searchPageObj.setTextInSearchBox("ABCD");
        Thread.sleep(5);

        searchPageObj.clickSearchButton();

        driver.close();


    }

}
